package ast.expressions;

import ast.definitions.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression {

    private String name;
    private Definition value;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }

}