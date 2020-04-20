package ast.definitions;

import ast.sentences.Sentence;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Sentence> body;

    private int localsNumberOfBytes;

    public FunctionDefinition(int line, int column, String name, Type type, List<Sentence> body) {
        super(line, column, name, type);
        this.body = body;
    }

    public List<Sentence> getBody() {
        return body;
    }

    public void setLocalsNumberOfBytes(int localsNumberOfBytes) { this.localsNumberOfBytes = localsNumberOfBytes; }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" +
                " name='" + name + '\'' +
                ", type=" + type +
                ", scope=" + scope +
                ", localsNumberOfBytes=" + localsNumberOfBytes +
                '}';
    }
}
