package visitor.semanthic;

import ast.ErrorHandler;
import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.ErrorType;
import ast.types.FunctionType;
import ast.types.Type;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type,Void> {

	// Definitions

	@Override
	public Void visit(FunctionDefinition element, Type params) {
		return super.visit(element, ((FunctionType) element.getType()).getReturnType());
	}

	// Statements ---------------------------------------------------------

	@Override
	public Void visit(Assign element, Type params) {
		super.visit(element, params);
		// Checks the left side of the assignation is valid
		if(element.getId().isNotLValue())
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getId().getLine(),element.getId().getColumn(),
					"(Invalid Assignation): unexpected token at the left of the assignation"));
		// Checks the right side if the correct type




		return null;
	}

	public Void visit(If element, Type params) {
		super.visit(element, params);
		// Checks the conditional is logical
		if (!element.getCondition().getType().isLogical())
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getCondition().getLine(),element.getCondition().getColumn(),
					"(Invalid Assignation): unexpected token at the left of the assignation"));
		return null;
	}

	@Override
	public Void visit(Read element, Type params) {
		super.visit(element, params);
		// Checks the expressions are valid to store the input
		element.getExpressions().stream().filter(Expression::isNotLValue).forEach(
				e -> ErrorHandler.getInstance().addError(
						new ErrorType(e.getLine(),e.getColumn(),
								"(Invalid Read): supplied tokens should be able to store the input")));
		return null;
	}

	@Override
	public Void visit(Return element, Type params) {
		super.visit(element, params);
		// Checks the expression matches the expected return type
		if (element.getReturnValue().getType().promotesTo(params) == null)
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getLine(),element.getColumn(),
							"(Invalid Return): this function must return " + params.getName()));

		return null;
	}

	// While
	// Write

	// Expressions ---------------------------------------------------------

	@Override
	public Void visit(ArithmeticOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		element.setType(
				element.getLeft().getType().arithmetic(
						((ArithmeticOperation) params).getRight().getType(), element));
		return null;
	}

	@Override
	public Void visit(ArrayAccess element, Type params) {
		super.visit(element, params);
		element.setLValue(true);
		element.setType(element.getLeft().getType());
		return null;
	}

	@Override
	public Void visit(Call element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		element.setType(element.getFunction().getType().parenthesis(element.getParams(), element));
		return null;
	}

	@Override
	public Void visit(Cast element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(CharacterLiteral element, Type params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(ComparisonOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(FieldAccess element, Type params) {
		super.visit(element, params);
		element.setLValue(true);
		return null;
	}

	@Override
	public Void visit(IntegerLiteral element, Type params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(LogicalNotOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(LogicalOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(RealLiteral element, Type params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(UnaryMinusOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Void visit(Variable element, Type params) {
		element.setLValue(true);
		if (element.getDefinition() == null)
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getLine(), element.getColumn(), "The variable " + element.getName() +
						"is not yet defined"));
		else
			element.setType(element.getDefinition().getType());
		return null;
	}
}
