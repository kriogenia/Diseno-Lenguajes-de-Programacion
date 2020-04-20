package ast.expressions;

import visitor.Visitor;

public class RealLiteral extends AbstractExpression {

    private double value;

    public RealLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "RealLiteral{" +
                "value=" + value +
                '}';
    }
}
