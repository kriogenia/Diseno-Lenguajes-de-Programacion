package ast.expressions;

import ast.AbstractASTNode;

public class FieldAccess extends AbstractASTNode implements Expression{

    private Expression expression;
    private String name;

    public FieldAccess(int line, int column, String name, Expression expression) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }
}
