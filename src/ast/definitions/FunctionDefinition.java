package ast.definitions;

import ast.sentences.Sentence;
import ast.types.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Sentence> body;

    public FunctionDefinition(int line, int column, String name, Type type, List<Sentence> body) {
        super(line, column, name, type);
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" +
                "body=" + body.size() +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
