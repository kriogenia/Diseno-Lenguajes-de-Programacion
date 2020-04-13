package ast.expressions;

import ast.types.Type;
import visitors.Visitor;

public class Cast extends AbstractExpression {

    private Expression expression;
    private Type typeToCast;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.typeToCast = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getTypeToCast() {
        return typeToCast;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Cast{" +
                "(" + typeToCast + ")" + expression +
                '}';
    }
}
