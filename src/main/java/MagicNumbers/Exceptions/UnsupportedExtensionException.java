package MagicNumbers.Exceptions;

public class UnsupportedExtensionException extends Exception{
    public UnsupportedExtensionException(String readedExtension) {
        super("Extension " + readedExtension + " is not supported.");
    }
}
