package ast.sentences;

import ast.expressions.Expression;

public class Return implements Sentence {

    private Expression returnValue;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
