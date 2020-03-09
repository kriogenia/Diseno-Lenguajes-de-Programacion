package ast;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;

public class ErrorHandler {

    private List<ErrorType> errors;

    private static ErrorHandler instance;

    private ErrorHandler() {
        this.errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        if (instance == null)
            instance = new ErrorHandler();
        return instance;
    }

    public boolean anyError() {
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream out) {
        errors.forEach(x -> out.println(x));
    }

    public void addError(ErrorType error) {
        errors.add(error);
    }
}
