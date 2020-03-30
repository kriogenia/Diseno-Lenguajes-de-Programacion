package ast.expressions;

import ast.ASTNode;
import ast.types.Type;

public interface Expression extends ASTNode {

	// Left Value methods
	boolean isNotLValue();
	void setLValue(boolean lValue);
	// Type Checking methods
	Type getType();
	void setType(Type t);
}
