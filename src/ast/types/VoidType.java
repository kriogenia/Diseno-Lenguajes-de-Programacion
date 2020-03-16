package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class VoidType extends AbstractASTNode implements Type {

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
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "VoidType";
    }
}
