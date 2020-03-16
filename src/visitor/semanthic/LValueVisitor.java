package visitor.semanthic;

import ast.expressions.*;
import ast.sentences.Assign;
import ast.types.ErrorType;
import visitor.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor {

	@Override
	public Object visit(Assign element, Object buffer) {
		element.getId().accept(this, buffer);
		// Checks the left side of the assignation is valid
		if(!element.getId().getLValue())
			new ErrorType(element.getLine(),element.getColumn(),
					"ERROR (Invalid Assignation): unexpected token at the left of the assignation");
		// Continues checking the assignation
		element.getRefered().accept(this, buffer);
		return null;
	}

	// Expressions ---------------------------------------------------------

	@Override
	public Object visit(ArithmeticOperation element, Object buffer) {
		element.getLeft().accept(this, buffer);
		element.getRight().accept(this, buffer);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ArrayAccess element, Object buffer) {
		element.getLeft().accept(this, buffer);
		element.getRight().accept(this, buffer);
		element.setLValue(true);
		return null;
	}

	@Override
	public Object visit(Cast element, Object buffer) {
		element.getExpression().accept(this, buffer);
		element.getType().accept(this, buffer);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(CharacterLiteral element, Object buffer) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ComparisonOperation element, Object buffer) {
		element.getLeft().accept(this, buffer);
		element.getRight().accept(this, buffer);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(FieldAccess element, Object buffer) {
		element.getExpression().accept(this, buffer);
		element.setLValue(true);
		return null;
	}

	@Override
	public Object visit(IntegerLiteral element, Object buffer) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(LogicalNotOperation element, Object buffer) {
		element.getExpression().accept(this, buffer);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(LogicalOperation element, Object buffer) {
		element.getLeft().accept(this, buffer);
		element.getRight().accept(this, buffer);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(RealLiteral element, Object buffer) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(UnaryMinusOperation element, Object buffer) {
		element.getExpression().accept(this, buffer);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(Variable element, Object buffer) {
		element.setLValue(true);
		return null;
	}
}
