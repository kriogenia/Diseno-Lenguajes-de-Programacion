package ast.types;

import ast.definitions.AbstractDefinition;

public class RecordField extends AbstractDefinition {

    private String name;
    private Type type;
    private int scope;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    public RecordField(int line, int column, String name, Type type, int scope) {
        super(line, column, name, type);
        this.scope = scope;
    }
}
