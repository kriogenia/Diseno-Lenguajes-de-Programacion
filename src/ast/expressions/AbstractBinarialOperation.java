package ast.expressions;

import ast.AbstractASTNode;

public class AbstractBinarialOperation extends AbstractASTNode implements Expression {

    private String operation;
    private Expression left;
    private Expression right;

    public AbstractBinarialOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column);
        this.left = left;
        this.operation = operation;
        this.right = right;
    }
}
