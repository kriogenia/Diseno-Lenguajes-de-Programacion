package ast.types;

import ast.definitions.AbstractDefinition;
import visitors.Visitor;

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
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "scope=" + scope +
                '}';
    }
}
