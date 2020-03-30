package visitor.semanthic;

import ast.ErrorHandler;
import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type,Void> {

	/***************************************************
	 *                 DEFINITIONS                     *
	 **************************************************/

	@Override
	public Void visit(FunctionDefinition element, Type params) {
		return super.visit(element, ((FunctionType) element.getType()).getReturnType());
	}

	/***************************************************
	 *                  SENTENCES                      *
	 **************************************************/

	@Override
	public Void visit(Assign element, Type params) {
		super.visit(element, params);
		// Checks the left side of the assignation is valid
		if(element.getId().isNotLValue())
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getId().getLine(),element.getId().getColumn(),
					"(Invalid Assigment): The left side of an assignment should be able to store the value."));
		// Checks if the right side is the correct type
		Type promotion = element.getId().getType().promotesTo(element.getRefered().getType(), element);
		if (promotion instanceof ErrorType)
			ErrorHandler.getInstance().addError((ErrorType) promotion);
		return null;
	}

	public Void visit(If element, Type params) {
		super.visit(element, params);
		// Checks the conditional is logical
		if (!element.getCondition().getType().isLogical())
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getCondition().getLine(),element.getCondition().getColumn(),
					element.getCondition().getType().getName() + " is not a logical expression."));
		return null;
	}

	@Override
	public Void visit(Read element, Type params) {
		super.visit(element, params);
		// Checks the expressions are valid to store the input
		element.getExpressions().stream().filter(Expression::isNotLValue).forEach(
				e -> ErrorHandler.getInstance().addError(
						new ErrorType(e.getLine(),e.getColumn(),
								"(Invalid Expression): You can't store an input on this token.")));
		return null;
	}

	@Override
	public Void visit(Return element, Type params) {
		super.visit(element, params);
		// Checks the expression matches the expected return type
		Type promotion = element.getReturnValue().getType().promotesTo(params, element);
		if (promotion instanceof ErrorType)
			ErrorHandler.getInstance().addError((ErrorType) promotion);
		return null;
	}

	// While
	// Write

	/***************************************************
	 *                  EXPRESSIONS                    *
	 **************************************************/

	@Override
	public Void visit(ArithmeticOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		element.setType( element.getLeft().getType().arithmetic( element.getRight().getType(), element));
		return null;
	}

	@Override
	public Void visit(ArrayAccess element, Type params) {
		super.visit(element, params);
		element.setLValue(true);
		element.setType(element.getLeft().getType().indexing(element.getRight().getType(), element));
		return null;
	}

	@Override
	public Void visit(Call element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		// Checks the parameters match the arguments
		element.setType(element.getFunction().getType().parenthesis(element.getParams(), element));
		if (element.getType() instanceof ErrorType)
			ErrorHandler.getInstance().addError((ErrorType) (element.getType()));
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
		element.setType(CharacterType.getInstance());
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
		element.setType(IntegerType.getInstance());
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
		element.setType(RealType.getInstance());
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
