package ast.sentences;

import ast.expressions.Expression;

public class Assign implements Sentence {

    private Expression id;
    private Expression refered;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
