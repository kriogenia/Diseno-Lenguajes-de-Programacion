package ast.expressions;

import visitor.Visitor;

public class FieldAccess extends AbstractExpression {

    private Expression expression;
    private String name;

    public FieldAccess(int line, int column, String name, Expression expression) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "FieldAccess{" + expression +
                "." + name + '\'' +
                '}';
    }
}
