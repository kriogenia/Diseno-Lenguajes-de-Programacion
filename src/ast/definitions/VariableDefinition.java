package ast.definitions;

import ast.ASTNode;
import ast.sentences.Sentence;
import ast.types.Type;

public class VariableDefinition extends AbstractDefinition {

    private int scope;
    private int offset;

    public VariableDefinition(int line, int column, String name, Type type, int scope, int offset) {
        super(line, column, name, type);
        this.scope = scope;
        this.offset = offset;
    }
}
