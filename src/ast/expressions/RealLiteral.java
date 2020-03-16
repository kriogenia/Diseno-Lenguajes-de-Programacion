package ast.expressions;

import visitor.Visitor;

public class RealLiteral extends AbstractExpression {

    private double value;

    public RealLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "RealLiteral{" +
                "value=" + value +
                '}';
    }
}
