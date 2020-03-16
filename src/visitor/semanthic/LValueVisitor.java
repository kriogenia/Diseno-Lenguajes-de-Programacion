package visitor.semanthic;

import ast.expressions.*;
import visitor.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor {

	@Override
	public Object visit(ArithmeticOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(ArrayAccess element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Cast element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(CharacterLiteral element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(ComparisonOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(FieldAccess element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(IntegerLiteral element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(LogicalNotOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(LogicalOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(RealLiteral element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(UnaryMinusOperation element, Object buffer) {
		return null;
	}

	@Override
	public Object visit(Variable element, Object buffer) {
		element.setLValue(true);
		return null;
	}
}
