package ss15_exception.model;

public class IdNotFoundException extends Exception{
    public IdNotFoundException(String message) {
        super(message);
    }
}
