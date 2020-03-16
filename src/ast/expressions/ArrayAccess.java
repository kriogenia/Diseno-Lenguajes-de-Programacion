package ast.expressions;

import visitor.Visitor;

public class ArrayAccess extends AbstractExpression {

    private Expression left;
    private Expression right;

    public ArrayAccess(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "ArrayAccess{" + left +
                "[" + right + "]}";
    }
}
