package MagicNumbers.Exceptions;

public class DifferentTypesException extends Exception {
    public DifferentTypesException(String readedExtension, String actualExtension) {
        super("Extension is " + readedExtension + ", while actually it's a " + actualExtension);
    }
}