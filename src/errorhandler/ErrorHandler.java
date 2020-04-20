package errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.*;

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
        errors.sort(null);
        errors.forEach(out::println);
    }

    public void addError(ErrorType error) {
        if (!errors.contains(error))
            errors.add(error);
    }

}
