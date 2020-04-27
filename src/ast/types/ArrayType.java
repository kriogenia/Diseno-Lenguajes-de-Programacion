package ast.types;

import ast.ASTNode;
import visitor.Visitor;

public class ArrayType extends AbstractType {

    private int size;
    private Type type;

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

	@Override
	public String getName() {
		return "["+ this.size + "," + type.getName() + "]";
	}

	@Override
	public int getNumberOfBytes() { return size * type.getNumberOfBytes(); }

    public Type getType() {
        return type;
    }

	@Override
	public Type indexing(Type t, ASTNode ast) {
    	if (t instanceof ErrorType)
    		return t;
    	if (t == IntegerType.getInstance())
			return type;
    	return new ErrorType(
    			ast.getLine(), ast.getColumn(), "You can't access the array with a " + t.getName());
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
