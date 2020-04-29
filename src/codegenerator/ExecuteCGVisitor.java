package codegenerator;

import ast.Program;
import ast.definitions.*;
import ast.expressions.Call;
import ast.expressions.Expression;
import ast.sentences.*;
import ast.types.FunctionType;
import ast.types.VoidType;

import java.util.stream.Collectors;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void> {

	private AddressCGVisitor addressCGVisitor;
	private ValueCGVisitor valueCGVisitor;

	public ExecuteCGVisitor(CG cg) {
		super(cg);
		this.valueCGVisitor = new ValueCGVisitor(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg, valueCGVisitor);
		this.valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
	}

	/*
		execute [[Program : program -> defs:Definition*]]() =

			for(Definition d: defs)
				if(d instanceof VariableDefinition)
					execute[[d]]

			<call main>
			<halt>

			for(Definition d: defs)
				if(d instanceof FunctionDefinition)
					execute[[d]]
	 */

	public Void visit (Program element, FunctionDefinition param) {
		for (Definition d: element.getDefinitions().stream()
				.filter(x -> x instanceof VariableDefinition).collect(Collectors.toList()))
			d.accept(this, param);

		cg.start();

		for (Definition d: element.getDefinitions().stream()
				.filter(x -> x instanceof FunctionDefinition).collect(Collectors.toList()))
			d.accept(this, (FunctionDefinition) d);

		return null;
	}

	/*
		execute[[FunctionDefinition : def -> body:Sentence*]]() =
			def.name <:>
			<' * Parameters>
			for(Definition d: def.type.args)
				execute[[d]]
			<' * Local variables>
			for(Definition d: body)
				if (d instance of VariableDefinition)
					execute[[d]]
			<enter> def.localNumberOfBytes
			for(Sentence st: body)
				execute[[st]]
			if (def.type.returnType == Void)
				<ret 0, def.localNumberOfBytes, def.type.argsNumberOfBytes>
	 */
	public Void visit(FunctionDefinition element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		cg.define(element.getName());
		cg.comment("Parameters");
		for (Definition d: ((FunctionType) element.getType()).getArgs())
			d.accept(this, params);
		cg.comment("Local variables");
		for (Sentence s: element.getBody().stream()
				.filter(x -> x instanceof VariableDefinition).collect(Collectors.toList()))
			s.accept(this, params);
		cg.enter(element.getLocalsNumberOfBytes());
		for (Sentence s: element.getBody().stream()
				.filter(x -> !(x instanceof VariableDefinition)).collect(Collectors.toList()))
			s.accept(this, params);
		if (((FunctionType) element.getType()).getReturnType().equals(VoidType.getInstance()))
			cg.ret(0, element.getLocalsNumberOfBytes(),
					((FunctionType) element.getType()).getArgsNumberOfBytes());
		return null;
	}

	/*
		execute[[VariableDefinition : def ]]() =
			' * def.type.name def.name def.offset
	 */
	public Void visit(VariableDefinition element, FunctionDefinition params) {
		cg.comment(element.getType().getName() + " " + element.getName() + " (offset " + element.getOffset() + ")");
		return null;
	}

	/*
		execute[[Assign : sentence -> id:Expression refered:Expression]]() =
			address[[id]]
			value[[refered]]
			<store> sentence.type.suffix
	 */
	public Void visit(Assign element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		element.getId().accept(addressCGVisitor, null);
		element.getRefered().accept(valueCGVisitor, null);
		cg.store(element.getId().getType());
		return null;
	}

	/*
		execute[[Call : sentence -> function:Variable params:Expression*]() =
			value[[sentence]]
			if (sentence.type != void)
				<pop> sentence.type.suffix
	 */
	public Void visit(Call element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		element.accept(valueCGVisitor, null);
		if (!((FunctionType) element.getType()).getReturnType().equals(VoidType.getInstance()))
			cg.pop(((FunctionType) element.getType()).getReturnType());
		return null;
	}

	/*
		execute[[If : sentence -> condition:Expression then:Sentence* else:Sentence*]() =
			int labelNumber = cg.getLabels(2);
			value[[condition]]
			<jz label> labelNumber
			for (Sentence s: then)
				execute[[s]]
			<jpm label> labelNumber+1
			<label> labelNumber <:>
			for (Sentence s: else)
				execute[[s]]
			<label> labelNumber+1 <:>
	 */
	public Void visit(If element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		cg.comment("If statement");
		int label = cg.getLabels(2);
		element.getCondition().accept(valueCGVisitor, null);
		cg.jz(label);
		cg.comment("Body of the if branch");
		element.getThen().forEach((s) -> s.accept(this, params));
		cg.jmp(label+1);
		cg.label(label);
		cg.comment("Body of the else branch");
		element.get_else().forEach((s) -> s.accept(this, params));
		cg.label(label+1);
		return null;
	}

	/*
		execute[[Read : sentence -> exprs:Expression*]]() =
			' * Read
			for (Expression e: exprs)
				address[[e]]
				<in> e.type.suffix
				<store> e.type.suffix
	 */
	public Void visit(Read element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		for(Expression s: element.getExpressions()) {
			cg.comment("Read");
			s.accept(addressCGVisitor, null);
			cg.in(s.getType());
		}
		return null;
	}

	/*
		execute[[Return : sentence -> returnValue:Expression]](FunctionDefinition fundef) =
			value[[returnValue]]
			<ret> returnValue.type.size <,> fundef.localsNumberOfBytes <,> fundef.type.argsNumberOfBytes
	 */
	public Void visit(Return element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		cg.comment("Return");
		element.getReturnValue().accept(valueCGVisitor, null);
		cg.ret(element.getReturnValue().getType().getNumberOfBytes(),
				params.getLocalsNumberOfBytes(),
				((FunctionType) params.getType()).getArgsNumberOfBytes());
		return null;
	}

	/*
		execute[[While : sentence -> condition:Expression body:Sentence*]]() =
			int labelNumber = cg.getLabels(2);
			<label> labelNumber <:>
			value[[condition]]
			<jz label> labelNumber+1
			for(Sentence s: body)
				execute[[s]]
			<jmp label> labelNumber
			<label> labelNumber+1 <:>
	 */
	public Void visit(While element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		cg.comment("While");
		int label = cg.getLabels(2);
		cg.label(label);
		element.getCondition().accept(valueCGVisitor, null);
		cg.jz(label+1);
		cg.comment("Body of the while statement");
		element.get_do().forEach((s) -> s.accept(this, null));
		cg.jmp(label);
		cg.label(label+1);
		return null;
	}

	/*
		execute[[Write : sentence -> exprs:Expression*]]() =
			' * Write
			for(Expression e: exprs)
				value[[e]]
				<out> e.type.suffix()
	 */
	public Void visit(Write element, FunctionDefinition params) {
		cg.commentLine(element.getLine());
		for(Expression exp: element.getExpressions()) {
			cg.comment("Write");
			exp.accept(valueCGVisitor, null);
			cg.out(exp.getType());
		}
		return null;
	}

}
