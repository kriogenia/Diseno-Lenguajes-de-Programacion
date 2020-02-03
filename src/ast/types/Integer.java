package ast.types;

public class Integer implements Type {

    private int value;

    @Override
    public Object getValue() {
        return value;
    }
}
