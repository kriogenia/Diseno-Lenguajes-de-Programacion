package ast.expressions;

import ast.AbstractASTNode;
import visitor.Visitor;

public class RealLiteral extends AbstractASTNode implements Expression {

    private double value;

    public RealLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "RealLiteral{" +
                "value=" + value +
                '}';
    }
}
