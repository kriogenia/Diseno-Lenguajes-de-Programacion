package ast.expressions;

import visitors.Visitor;

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
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "UnaryMinusOperation{" +
                "-" + expression +
                '}';
    }
}
