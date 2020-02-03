package ast.types;

public class Character implements Type {

    private char value;

    @Override
    public Object getValue() { return value; }
}