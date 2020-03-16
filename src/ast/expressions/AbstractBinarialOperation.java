package ast.expressions;

public abstract class AbstractBinarialOperation extends AbstractExpression {

    private String operation;
    private Expression left;
    private Expression right;

    AbstractBinarialOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column);
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "BinarialOperation{" +
                left + operation + right +
                '}';
    }

}
