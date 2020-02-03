package ast.definitions;

import ast.sentences.Sentence;
import ast.types.Type;

import java.util.List;

public class FunctionDefinition implements Definition {

    private String name;
    private Type type;
    private List<Sentence> body;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
