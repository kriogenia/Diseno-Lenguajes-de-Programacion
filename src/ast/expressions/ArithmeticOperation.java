package ast.expressions;

import visitor.Visitor;

public class ArithmeticOperation extends AbstractBinarialOperation {

    public ArithmeticOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

}
