package MagicNumbers;

import java.io.File;

import static MagicNumbers.app.MagicNumbers.checkTheFile;

public class Main {
    public static void main(String[] args) {
            // load file as arg
        File file = new File(args[0]);

            // check the file
        checkTheFile(file);
    }
}
