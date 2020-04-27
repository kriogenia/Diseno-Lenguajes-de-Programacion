package ast.types;

import ast.definitions.AbstractDefinition;
import visitor.Visitor;

public class RecordField extends AbstractDefinition {

    private int offset;
    private int scope;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    public RecordField(int line, int column, String name, Type type, int scope) {
        this(line, column, name, type);
        this.scope = scope;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    int getOffset() {
        return offset;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "(" + super.getName() + " " + getType().getName() + ")";
    }
}
