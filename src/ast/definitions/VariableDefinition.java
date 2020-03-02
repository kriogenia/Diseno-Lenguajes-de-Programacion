package ast.definitions;

import ast.ASTNode;
import ast.sentences.Sentence;
import ast.types.Type;

public class VariableDefinition extends AbstractDefinition implements Sentence {

    private int scope;
    private int offset;

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    public VariableDefinition(int line, int column, String name, Type type, int scope, int offset) {
        this(line, column, name, type);
        this.scope = scope;
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "VariableDefinition{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
