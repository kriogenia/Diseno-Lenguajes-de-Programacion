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
	public boolean isNotLogical() {
		return true;
	}

	@Override
	public boolean isBuiltInType() { return false; }

	@Override
	public Type arithmetic(ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), "(Invalid Operation): You can't substract " +
				this.getName());
	}

	@Override
	public Type arithmetic(Type t, ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), "(Invalid Operation): You can't operate " +
				this.getName() + " with " + t.getName());
	}

	@Override
	public Type cast(Type type, ASTNode ast) {
		if (!(this.isBuiltInType() && type.isBuiltInType()))
			return new ErrorType(ast.getLine(), ast.getColumn(),
				"(Invalid Cast): " + this.getName() + " can't be cast into " + type.getName());
		return type;
	}

	@Override
	public Type comparison(Type t, ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), "(Invalid Comparison): You can't compare " +
				this.getName() + " with " + t.getName());
	}

	@Override
	public Type indexing(Type t, ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(),
				"(Invalid Access): " + this.getName() + " is not an array");
	}

	@Override
	public Type logical(ASTNode ast) {
		return new ErrorType(ast.getLine(),ast.getColumn(), "(Invalid Operation): You can't negate " +
				this.getName());
	}

	@Override
	public Type parenthesis(List<Expression> types, ASTNode ast) {
		return new ErrorType(ast.getLine(), ast.getColumn(),
				"(Invalid Function Call): The called token is not a function");
	}

	@Override
	public Type promotesTo(Type type, ASTNode ast) {
		if (type instanceof ErrorType)
			return type;
		return new ErrorType(ast.getLine(), ast.getColumn(),
				"(Invalid Type): " + this.getName() + " is not of type " + type.getName());
	}
}
