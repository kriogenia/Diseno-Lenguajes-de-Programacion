package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;

import java.util.List;

public interface Type extends ASTNode  {

	String getName();

	boolean isNotLogical();
	boolean isBuiltInType();

	Type arithmetic(ASTNode ast);
	Type arithmetic(Type type, ASTNode ast);
	Type cast(Type type, ASTNode ast);
	Type comparison(Type type, ASTNode ast);
	Type indexing(Type type, ASTNode ast);
	Type parenthesis(List<Expression> types, ASTNode ast);
	Type promotesTo(Type type, ASTNode ast);

}