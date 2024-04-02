package LLD1.ExceptionHandling.Throw;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
