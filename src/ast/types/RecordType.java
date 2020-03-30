package ast.types;

import visitor.Visitor;

import java.util.List;

public class RecordType extends AbstractType {

    private List<RecordField> records;

    public RecordType(int line, int column, List<RecordField> records) {
        super(line, column);
        this.records = records;
    }

    public List<RecordField> getRecords() {
        return records;
    }

    @Override
    public String getName() {
        return "struct";
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "RecordType{" +
                "records=" + records.size() +
                '}';
    }
}
