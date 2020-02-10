package ast.expressions;

public class ArithmeticOperation extends AbstractBinarialOperation {

    public ArithmeticOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }

}
