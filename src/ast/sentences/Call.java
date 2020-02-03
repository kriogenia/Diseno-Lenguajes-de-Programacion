package ast.sentences;

import ast.expressions.Expression;

import java.util.List;

public class Call implements Sentence {

    private Expression function;
    private List<Expression> params;


    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
