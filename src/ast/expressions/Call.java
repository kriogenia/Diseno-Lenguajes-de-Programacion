package ast.expressions;

import ast.sentences.Sentence;
import visitors.Visitor;

import java.util.List;

public class Call extends AbstractExpression implements Sentence {

    private Variable function;
    private List<Expression> params;

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
}
