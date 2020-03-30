package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.expressions.Expression;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type  {

	AbstractType(int line, int column) {
		super(line, column);
	}

	@Override
	public Type arithmetic(ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), "Invalid operation, you can't substract " +
				this.getName());
	}

	@Override
	public Type arithmetic(Type t, ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), "Invalid operation members, you can't operate" +
				this.getName() + " with " + t.getName());
	}

	@Override
	public boolean isLogical() {
		return false;
	}

	@Override
	public Type promotesTo(Type type) {
		if (type instanceof ErrorType)
			return type;
		return null;
	}

	@Override
	public Type indexing(Type t, ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), this.getName() + " is not an array");
	}

	@Override
	public Type parenthesis(List<Expression> types, ASTNode ast) {
		return new ErrorType(ast.getLine(), ast.getColumn(), "Invoked methods should be functions");
	}
}
