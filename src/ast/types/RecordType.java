package ast.types;

import ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractASTNode implements Type {

    private List<RecordField> records;

    public RecordType(int line, int column, List<RecordField> records) {
        super(line, column);
        this.records = records;
    }

}
