package ast.definitions;

import ast.sentences.Sentence;
import ast.types.Type;

public class VariableDefinition implements Definition, Sentence {

    private String name;
    private Type type;

    @Override
    public String getName() { return name; }

    @Override
    public Type getType() { return type; }
}
