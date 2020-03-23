package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class ArrayType extends AbstractASTNode implements Type {

    private int size;
    private Type type;

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

	@Override
	public <P, R> R accept(Visitor<P, R> visitor, P param) {
		return visitor.visit(this, param);
	}

    @Override
    public String toString() {
        return "ArrayType{" +
                "size=" + size +
                ", type=" + type +
                '}';
    }
}
