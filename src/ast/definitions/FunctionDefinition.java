package ast.definitions;

import ast.sentences.Sentence;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Sentence> body;

    public FunctionDefinition(int line, int column, String name, Type type, List<Sentence> body) {
        super(line, column, name, type);
        this.body = body;
    }

    public List<Sentence> getBody() {
        return body;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
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
