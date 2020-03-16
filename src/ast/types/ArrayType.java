package ast.types;

import ast.AbstractASTNode;
import ast.expressions.IntegerLiteral;
import visitor.Visitor;

public class ArrayType extends AbstractASTNode implements Type {

    private int size;
    private Type type;

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "ArrayType{" +
                "size=" + size +
                ", type=" + type +
                '}';
    }
}
