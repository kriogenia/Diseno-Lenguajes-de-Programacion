package ast.types;

import ast.definitions.AbstractDefinition;

public class RecordField extends AbstractDefinition {

    private int scope;

    public RecordField(String name, Type type) {
        super(0, 0, name, type);
    }

    public RecordField(String name, Type type, int scope) {
        this(name, type);
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "scope=" + scope +
                '}';
    }
}
