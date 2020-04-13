package ast.types;

import visitors.Visitor;

public class VoidType extends AbstractType {

    private static VoidType instance;

    private VoidType() {
        super(0, 0);
    }

    public static VoidType getInstance() {
        if (instance == null)
            instance = new VoidType();
        return instance;
    }

    @Override
    public String getName() {
        return "void";
    }

    @Override
    public int getSize() { return 0; }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "VoidType";
    }

}