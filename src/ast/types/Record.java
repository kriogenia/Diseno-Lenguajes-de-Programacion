package ast.types;

import java.util.List;

public class Record implements Type {

    private List<RecordField> records;

    @Override
    public Object getValue() {
        return records;
    }
}
