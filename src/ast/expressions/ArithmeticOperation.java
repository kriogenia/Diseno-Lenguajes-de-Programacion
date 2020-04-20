package ast.expressions;

import visitor.Visitor;

public class ArithmeticOperation extends AbstractBinarialOperation {

    public ArithmeticOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

}
