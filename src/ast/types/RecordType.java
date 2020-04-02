package ast.types;

import ast.ASTNode;
import ast.expressions.FieldAccess;
import visitor.Visitor;

import java.util.*;
import java.util.stream.Collectors;

public class RecordType extends AbstractType {

    private List<RecordField> records;

    public RecordType(int line, int column, List<RecordField> records) {
        super(line, column);
        this.records = records;
    }

    public List<RecordField> getRecords() {
        return records;
    }

    public List<ErrorType> getDuplicates() {
        Set<String> nonDuplicates = new HashSet<>();
        return records.stream().filter(f -> !nonDuplicates.add(f.getName()))
                .map(df -> new ErrorType(df.getLine(), df.getColumn(), "(Invalid Definition): the " +
                        df.getName() + " is already declared on this struct")).collect(Collectors.toList());
    }

    @Override
    public Type access(String field, ASTNode ast) {
        Optional<RecordField> match = records.stream().filter(f -> f.getName().equals(field)).findAny();
        if (match.isPresent())
            return match.get().getType();
        return new ErrorType(ast.getLine(),ast.getColumn(), "(Invalid Access): this struct doesn't " +
                "have a field named " + field);
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
