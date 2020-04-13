package visitors;

import ast.ErrorHandler;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import visitors.symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

	private SymbolTable table;

	public IdentificationVisitor() {
		table = new SymbolTable();
	}

	// Definitions ---------------------------------------------------------

	@Override
	public Void visit(FunctionDefinition element, Void params) {
		if (!table.insert(element))
			ErrorHandler.getInstance().addError(new ErrorType(element.getLine(),element.getColumn(),
					"(Invalid Definition): This function is already declared."));
		// We up the scope
		table.set();
		element.getType().accept(this, params);
		element.getBody().forEach(x -> x.accept(this, params));
		// and down it back before exiting the definition
		table.reset();
		return null;
	}

	@Override
	public Void visit(VariableDefinition element, Void params) {
		super.visit(element, params);
		if (!table.insert(element))
			ErrorHandler.getInstance().addError(new ErrorType(element.getLine(),element.getColumn(),
					"(Invalid Definition): The variable " + element.getName() + " is already declared on this scope"));
		return null;
	}

	// Variable ----------------------------------------------------------------

	@Override
	public Void visit(Variable element, Void params) {
		Definition definition = table.find(element.getName());
		if (definition == null)
			definition = new VariableDefinition(element.getLine(), element.getColumn(), element.getName(),
					new ErrorType(element.getLine(),element.getColumn(),
					"(Invalid Reference): The variable " + element.getName() + " is not yet defined"));
		element.setDefinition(definition);
		return null;
	}

}
