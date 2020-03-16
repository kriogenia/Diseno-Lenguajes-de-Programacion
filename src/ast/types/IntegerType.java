package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class IntegerType extends AbstractASTNode implements Type {

    private static IntegerType instance;

    private IntegerType() {
        super(0, 0);
    }

    public static IntegerType getInstance() {
        if (instance == null)
            instance = new IntegerType();
        return instance;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "IntegerType";
    }
}
