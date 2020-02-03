package ast.types;

public class Real implements Type {

    private double value;

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
