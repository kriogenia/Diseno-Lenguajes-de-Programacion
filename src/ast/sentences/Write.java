package ast.sentences;

import java.util.List;

public class Write implements Sentence {

    private List<Sentence> sentences;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
