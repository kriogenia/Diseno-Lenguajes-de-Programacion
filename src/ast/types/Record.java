package ast.types;

import java.util.List;

public class Record implements Type {

    private List<RecordField> records;

    @Override
    public Object getValue() {
        return records;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
