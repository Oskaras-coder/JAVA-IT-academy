package swed.it.academy.project;


public class UnknownShapeException extends Exception {

    private final String message;

    public UnknownShapeException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
