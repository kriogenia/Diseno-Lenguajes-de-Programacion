package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import ast.expressions.Variable;

import java.util.ArrayList;
import java.util.List;

public class Call extends AbstractASTNode implements Sentence, Expression {

    private Variable function;
    private List<Expression> params;

    public Call(int line, int column, Variable function, List<Expression> params) {
        super(line, column);
        this.function = function;
        this.params = new ArrayList<>();
        this.params.addAll(params);
    }
}
