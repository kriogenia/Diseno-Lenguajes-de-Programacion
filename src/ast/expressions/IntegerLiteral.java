package ast.expressions;

import visitor.Visitor;

public class IntegerLiteral extends AbstractExpression {

    private int value;

    public IntegerLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "IntegerLiteral{" +
                "value=" + value +
                '}';
    }
}
