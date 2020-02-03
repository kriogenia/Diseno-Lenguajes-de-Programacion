package ast.definitions;

import ast.ASTNode;
import ast.sentences.Sentence;
import ast.types.Type;

public class VariableDefinition implements Definition, Sentence {

    private String name;
    private Type type;

    @Override
    public String getName() { return name; }

    @Override
    public Type getType() { return type; }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
