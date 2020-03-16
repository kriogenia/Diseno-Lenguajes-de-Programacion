package visitor.semanthic;

import ast.expressions.*;
import ast.sentences.Assign;
import ast.sentences.Call;
import ast.types.ErrorType;
import visitor.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor {

	@Override
	public Object visit(Assign element, Object params) {
		element.getId().accept(this, params);
		// Checks the left side of the assignation is valid
		if(!element.getId().getLValue())
			new ErrorType(element.getLine(),element.getColumn(),
					"ERROR (Invalid Assignation): unexpected token at the left of the assignation");
		// Continues checking the assignation
		element.getRefered().accept(this, params);
		return null;
	}

	// Expressions ---------------------------------------------------------

	@Override
	public Object visit(ArithmeticOperation element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ArrayAccess element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		element.setLValue(true);
		return null;
	}

	@Override
	public Object visit(Call element, Object params) {
		element.getFunction().accept(this,params);
		element.getParams().forEach(x -> x.accept(this, params));
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(Cast element, Object params) {
		element.getExpression().accept(this, params);
		element.getType().accept(this, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(CharacterLiteral element, Object params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(ComparisonOperation element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(FieldAccess element, Object params) {
		element.getExpression().accept(this, params);
		element.setLValue(true);
		return null;
	}

	@Override
	public Object visit(IntegerLiteral element, Object params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(LogicalNotOperation element, Object params) {
		element.getExpression().accept(this, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(LogicalOperation element, Object params) {
		element.getLeft().accept(this, params);
		element.getRight().accept(this, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(RealLiteral element, Object params) {
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(UnaryMinusOperation element, Object params) {
		element.getExpression().accept(this, params);
		element.setLValue(false);
		return null;
	}

	@Override
	public Object visit(Variable element, Object params) {
		element.setLValue(true);
		return null;
	}
}
