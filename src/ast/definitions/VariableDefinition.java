package ast.definitions;

import ast.sentences.Sentence;
import ast.types.Type;
import visitors.Visitor;

public class VariableDefinition extends AbstractDefinition implements Sentence {

    private int offset;

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    public void setOffset(int offset) {this.offset = offset; }

    @Override
    public String toString() {
        return "VariableDefinition{" +
                " name='" + name + '\'' +
                ", type=" + type +
                ", scope=" + scope +
                ", offset=" + offset +
                '}';
    }
}
