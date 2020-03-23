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
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "IntegerType";
    }
}
