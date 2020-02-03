package ast.expressions;

public class ArrayAccess implements Expression{

    private Expression left;
    private Expression right;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
