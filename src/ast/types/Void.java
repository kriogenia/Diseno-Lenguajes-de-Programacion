package ast.types;

public class Void implements Type {

    @Override
    public Object getValue() {
        return null;
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
