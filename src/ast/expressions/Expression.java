package ast.expressions;

import ast.ASTNode;

public interface Expression extends ASTNode {

	// Left Value methods
	boolean getLValue();
	void setLValue(boolean lValue);
}
