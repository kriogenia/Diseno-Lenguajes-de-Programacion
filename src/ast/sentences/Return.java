package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;

public class Return extends AbstractASTNode implements Sentence {

    private Expression returnValue;

    public Return(int line, int column, Expression returnValue) {
        super(line, column);
        this.returnValue = returnValue;
    }
}
