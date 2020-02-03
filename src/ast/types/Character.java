package ast.types;

public class Character implements Type {

    private char value;

    @Override
    public Object getValue() { return value; }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}