package ast.expressions;

import ast.AbstractASTNode;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

	private boolean lValue;

	AbstractExpression(int line, int column) {
		super(line, column);
	}

	public boolean getLValue() {
		return lValue;
	}

	public void setLValue(boolean lValue) {
		this.lValue = lValue;
	}
}
