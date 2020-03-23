package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import ast.expressions.Variable;
import visitor.Visitor;

import java.util.List;

public class Call extends AbstractASTNode implements Sentence, Expression {

    private Variable function;
    private List<Expression> params;
    private boolean lValue;

    public Call(int line, int column, Variable function, List<Expression> params) {
        super(line, column);
        this.function = function;
        this.params = params;
    }

    public Variable getFunction() {
        return function;
    }

    public List<Expression> getParams() {
        return params;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Call{" +
                "function=" + function +
                ", params=" + params.size() +
                '}';
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}
