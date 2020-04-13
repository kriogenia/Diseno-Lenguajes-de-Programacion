package ast.expressions;

import ast.definitions.Definition;
import visitors.Visitor;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public Definition getDefinition() {
        return definition;
    }

    public String getName() {
        return name;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
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