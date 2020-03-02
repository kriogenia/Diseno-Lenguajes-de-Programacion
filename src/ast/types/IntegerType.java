package ast.types;

import ast.AbstractASTNode;

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
}
