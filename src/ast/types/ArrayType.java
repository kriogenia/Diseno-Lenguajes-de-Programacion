package ast.types;

import ast.AbstractASTNode;
import ast.expressions.IntegerLiteral;

public class ArrayType extends AbstractASTNode implements Type {

    private int size;
    private Type type;

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }
}
