package ast.expressions;

import ast.AbstractASTNode;

public class AbstractBinarialOperation extends AbstractASTNode implements Expression {

    private String operation;
    private Expression left;
    private Expression right;

    AbstractBinarialOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column);
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinarialOperation{" +
                left + operation + right +
                '}';
    }
}
