package ast.types;

import ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractASTNode implements Type {

    private List<RecordField> records;

    public RecordType(List<RecordField> records) {
        super(0, 0);
        this.records = records;
    }

}
