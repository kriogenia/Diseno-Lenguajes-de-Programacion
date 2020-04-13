package ast.types;

import visitors.Visitor;

public class ErrorType extends AbstractType implements Comparable {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String getName() {
        return "error";
    }

    @Override
    public int getNumberOfBytes() { throw new IllegalStateException("Can't access error size, pending compilation errors."); }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "ERROR [line: " + getLine() + ", column: " + getColumn() + "] - "
                + this.message;
    }

    @Override
    public int compareTo(Object o) {
        ErrorType b = (ErrorType)o;
        return (this.getLine() - b.getLine() == 0) ? this.getColumn() - b.getColumn() : this.getLine() - b.getLine();
    }
}
