package codegenerator;

import ast.Program;
import ast.definitions.*;
import ast.expressions.Expression;
import ast.sentences.*;
import ast.types.FunctionType;
import ast.types.VoidType;

import java.util.stream.Collectors;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;
	private ValueCGVisitor valueCGVisitor;

	public ExecuteCGVisitor(CG cg) {
		super(cg);
		this.valueCGVisitor = new ValueCGVisitor(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg, valueCGVisitor);
		this.valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
	}

	/*
		execute [[Program : program -> definition*]]() =

			for(Definition d: definition*)
				if(d instanceof VariableDefinition)
					execute[[d]]

			<call main>
			<halt>

			for(Definition d: definition*)
				if(d instanceof FunctionDefinition)
					execute[[d]]
	 */

	public Void visit (Program element, Void param) {
		for (Definition d: element.getDefinitions().stream()
				.filter(x -> x instanceof VariableDefinition).collect(Collectors.toList()))
			d.accept(this, param);

		cg.call("main");
		cg.halt();

		for (Definition d: element.getDefinitions().stream()
				.filter(x -> x instanceof FunctionDefinition).collect(Collectors.toList()))
			d.accept(this, param);

		return null;
	}

	/*
		execute[[FunctionDefinition : fundef -> type sentence* localNumberOfBytes]]() =
			fundef.name <:>
			<' * Parameters>
			for(Definition d: fundef.type.args)
				execute[[d]]
			<' * Local variables>
			for(Definition d: fundef.sentence*)
				if (d instance of VariableDefinition)
					execute[[d]]
			<enter> fundef.localNumberOfBytes
			for(Sentence st: sentences*)
				execute[[st]]
			if (fundef.type.returnType == Void)
				<ret 0,fundef.localNumberOfBytes,fundef.type.argsNumberOfBytes>
	 */
	public Void visit(FunctionDefinition element, Void params) {
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
		execute[[VariableDefinition : vardef -> type offset]]() =
			' * vardef.type.name vardef.name vardef.offset
	 */
	public Void visit(VariableDefinition element, Void params) {
		cg.comment(element.getType().getName() + " " + element.getName() + " (offset " + element.getOffset() + ")");
		return null;
	}

	/*
		execute[[Assign : sentence -> type id refered]]() =
			address[[id]]
			value[[refered]]
			<store> sentence.type.suffix
	 */
	public Void visit(Assign element, Void params) {
		element.getId().accept(addressCGVisitor, params);
		element.getRefered().accept(valueCGVisitor, params);
		cg.store(element.getId().getType());
		return null;
	}

	/*


		IF


	 */

	/*
		execute[[Read : sentence -> expression*]]() =
			' * Read
			for (Expression exp: expression*)
				address[[exp]]
				<in> exp.type.suffix
				<store> exp.type.suffix
	 */
	public Void visit(Read element, Void params) {
		for(Expression s: element.getExpressions()) {
			cg.comment("Read");
			s.accept(addressCGVisitor, params);
			cg.in(s.getType());
		}
		return null;
	}

	/*


		WHILE


	 */

	/*
		execute[[Write : sentence -> expression*]]() =

			for(Expression exp: expression*) {
				value[[exp]]
				<out> exp.type.suffix()
			}
	 */

	public Void visit(Write element, Void params) {
		for(Expression exp: element.getExpressions()) {
			cg.comment("Write");
			exp.accept(valueCGVisitor, params);
			cg.out(exp.getType());
		}
		return null;
	}

}
