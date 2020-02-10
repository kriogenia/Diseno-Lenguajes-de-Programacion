package ast.expressions;

public class ComparisonOperation extends AbstractBinarialOperation {

    public ComparisonOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }
}
