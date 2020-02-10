package ast.expressions;

import ast.AbstractASTNode;

public class LogicalNotOperation extends AbstractASTNode implements Expression {

    private Expression expression;

    public LogicalNotOperation(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
