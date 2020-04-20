package codegenerator;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Expression;
import ast.sentences.Write;

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
	execute[[FuncDefiniton: funcDefinition -> type statement*^]]() =
		funcDefinition.name <:>
		// Comentamos parametros
		// Comentamos variables locales
		<enter> ... funcDefinition.localNumberOfBytes
		for(Statement st: stament*)
			execute[[st]]
		if (funcDefintion.returnType == Void)
			<ret 0,funcDefinition.localNumberOfBytes,funcDefinition.type.argsNumberOfBytes>

	 */

	/*
	execute[[Write : statement -> expression*]]() =

		for(Expression exp: expression*) {
			value[[exp]]
			<out> exp.type.suffix()
		}
	 */

	public Void visit(Write element, Void params) {
		for(Expression exp: element.getExpressions()) {
			exp.accept(valueCGVisitor, params);
			cg.out(exp.getType());
		}
		return null;
	}

}
