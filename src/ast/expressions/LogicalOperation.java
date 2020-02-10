package ast.expressions;

public class LogicalOperation extends AbstractBinarialOperation {

    public LogicalOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }
}
