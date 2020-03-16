package ast.expressions;

import ast.AbstractASTNode;
import visitor.Visitor;

public class ArrayAccess extends AbstractASTNode implements Expression{

    private Expression left;
    private Expression right;

    public ArrayAccess(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayAccess{" + left +
                "[" + right + "]}";
    }
}
