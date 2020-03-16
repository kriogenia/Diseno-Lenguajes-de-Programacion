package ast.expressions;

import ast.types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {

    private Expression expression;
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Cast{" +
                "(" + type + ")" + expression +
                '}';
    }
}
