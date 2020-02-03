package ast.types;

public class Integer implements Type {

    private int value;

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
