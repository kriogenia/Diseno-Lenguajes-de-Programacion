package visitor.semanthic;

import ast.ErrorHandler;
import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.sentences.*;
import ast.types.*;
import visitor.AbstractVisitor;

import java.util.List;

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
		// Checks the left side is valid
		if(element.getId().getType() instanceof ErrorType) {
			ErrorHandler.getInstance().addError((ErrorType) element.getId().getType());
			return null;
		}
		// Checks the right side is valid
		if(element.getRefered().getType() instanceof ErrorType) {
			ErrorHandler.getInstance().addError((ErrorType) element.getRefered().getType());
			return null;
		}
		// Checks if the right side is the correct type
		Type promotion = element.getRefered().getType().promotesTo(element.getId().getType(), element);
		if (promotion instanceof ErrorType)
			ErrorHandler.getInstance().addError((ErrorType) promotion);
		return null;
	}

	@Override
	public Void visit(Call element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		element.setType(element.getFunction().getType().parenthesis(element.getParams(), element));
		// Checks the parameters match the arguments
		if (element.getType() instanceof ErrorType)
			ErrorHandler.getInstance().addError((ErrorType) (element.getType()));
		return null;
	}

	@Override
	public Void visit(If element, Type params) {
		super.visit(element, params);
		// Checks the conditional is logical
		if (element.getCondition().getType().isNotLogical())
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getCondition().getLine(),element.getCondition().getColumn(),
							"(Invalid Condition): " + element.getCondition().getType().getName() +
									" is not a logical expression."));
		return null;
	}

	@Override
	public Void visit(Read element, Type params) {
		super.visit(element, params);
		// Checks the expressions are valid
		element.getExpressions().stream().filter(e -> e.getType() instanceof ErrorType).forEach(
				e -> ErrorHandler.getInstance().addError(((ErrorType) e.getType())));
		// Checks the expressions are able to store the input
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

	@Override
	public Void visit(While element, Type params) {
		super.visit(element, params);
		// Checks the conditional is logical
		if (element.getCondition().getType().isNotLogical())
			ErrorHandler.getInstance().addError(
					new ErrorType(element.getCondition().getLine(),element.getCondition().getColumn(),
							"(Invalid Condition): " + element.getCondition().getType().getName() +
									" is not a logical expression."));
		return null;
	}

	@Override
	public Void visit(Write element, Type params) {
		super.visit(element, params);
		// Checks the expressions are valid
		element.getExpressions().stream().filter(e -> e.getType() instanceof ErrorType).forEach(
				e -> ErrorHandler.getInstance().addError(((ErrorType) e.getType())));
		return null;
	}

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
	public Void visit(Cast element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		element.setType(element.getExpression().getType().cast(element.getTypeToCast(), element));
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
		element.setType( element.getLeft().getType().comparison( element.getRight().getType(), element));
		return null;
	}

	@Override
	public Void visit(FieldAccess element, Type params) {
		super.visit(element, params);
		element.setLValue(true);
		element.setType(element.getExpression().getType().access(element.getName(), element));
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
		element.setType(element.getExpression().getType().logical(element));
		return null;
	}

	@Override
	public Void visit(LogicalOperation element, Type params) {
		super.visit(element, params);
		element.setLValue(false);
		element.setType( element.getLeft().getType().logical( element.getRight().getType(), element) );
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
		element.setType(element.getExpression().getType().arithmetic(element));
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

	/***************************************************
	 *                  EXPRESSIONS                    *
	 **************************************************/

	@Override
	public Void visit(RecordType element, Type params) {
		super.visit(element, params);
		List<ErrorType> badDefinitions = element.getDuplicates();
		if (!badDefinitions.isEmpty())
			badDefinitions.forEach(x -> ErrorHandler.getInstance().addError(x));
		return null;
	}
}
