package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

	private boolean lValue;
	private Type type;

	AbstractExpression(int line, int column) {
		super(line, column);
	}

	public boolean isNotLValue() {
		return !lValue;
	}
	public void setLValue(boolean lValue) {
		this.lValue = lValue;
	}

	public Type getType() { return type; }
	public void setType(Type t) { this.type = t; }

}
