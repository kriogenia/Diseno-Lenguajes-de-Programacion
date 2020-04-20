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

    public String getName() {
        return name;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "FieldAccess{" + expression +
                "." + name + '\'' +
                '}';
    }
}
