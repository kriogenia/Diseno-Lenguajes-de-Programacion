package ast.types;

import ast.definitions.AbstractDefinition;

public class RecordField extends AbstractDefinition {

    private int scope;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    public RecordField(int line, int column, String name, Type type, int scope) {
        this(line, column, name, type);
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "scope=" + scope +
                '}';
    }
}
