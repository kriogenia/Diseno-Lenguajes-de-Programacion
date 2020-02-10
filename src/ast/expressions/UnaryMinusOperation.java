package ast.expressions;

import ast.AbstractASTNode;

public class UnaryMinusOperation extends AbstractASTNode implements Expression{

    private Expression expression;

    public UnaryMinusOperation(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

}
