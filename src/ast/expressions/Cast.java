package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public class Cast extends AbstractASTNode implements Expression{

    private Expression expression;
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }
}
