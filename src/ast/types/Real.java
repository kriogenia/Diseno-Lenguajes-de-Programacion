package ast.types;

public class Real implements Type {

    private double value;

    @Override
    public Object getValue() {
        return value;
    }
}
