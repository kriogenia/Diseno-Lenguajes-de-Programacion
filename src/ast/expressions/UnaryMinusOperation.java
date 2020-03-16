package ast.expressions;

import visitor.Visitor;

public class UnaryMinusOperation extends AbstractExpression {

    private Expression expression;

    public UnaryMinusOperation(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "UnaryMinusOperation{" +
                "-" + expression +
                '}';
    }
}
