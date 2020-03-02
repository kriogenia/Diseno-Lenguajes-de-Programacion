package ast.types;

import ast.AbstractASTNode;
import ast.expressions.IntegerLiteral;

public class ArrayType extends AbstractASTNode implements Type {

    private int size;
    private Type type;

    private ArrayType(int size, Type type) {
        super(0, 0);
        this.size = size;
        this.type = type;
    }
}
