package MagicNumbers.app;

import MagicNumbers.Exceptions.DifferentTypesException;
import MagicNumbers.Exceptions.UnsupportedExtensionException;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class MagicNumbers {

    /**
     * Method checks type of input file
     * @param file input file that needs to be checked what type it is
     */
    public static String checkTheFile(File file){
        String message = "start";
        // read file
        try(DataInputStream inputFile = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))){
            // get file extension
            String inputFileExtension = getFileExtension(file);
            // check if it's text file
            if(checkIfTextFile(file)){
                System.out.println("This is text file.");
                message = "This is text file.";
                return message;
            } else{
                // read magic numbers
                String magicNumbers = getMagicNumbers(file);
                System.out.println("Magic numbers: " + magicNumbers);
                // convert magic numbers to correspond file type from FileTypes class
                String actualFileExtension = convertMagicNumbersToFileType(magicNumbers);
                // if magic numbers are not present in FileTypes class then it is UnknownType
                if (actualFileExtension.startsWith(("UnknownType"))){
                    throw new UnsupportedExtensionException(inputFileExtension);
                    // if actual file type is the same as input file extension then it's ok
                }else if(actualFileExtension.startsWith(inputFileExtension.toUpperCase())){
                    System.out.println("File type is " + inputFileExtension);
                    message = "File type is " + inputFileExtension;
                    return message;
                } else {
                    // throw exception if file extension is different then actual
                    throw new DifferentTypesException(inputFileExtension, actualFileExtension);
                }
            }
        } catch (IOException | DifferentTypesException | UnsupportedExtensionException ex){
            ex.printStackTrace();
        }
        return message;
    }

    /**
     * Converts magic numbers into correspond Filetype from FileTypes class
     * @param magicNumbers input String is magic numbers
     * @return FileType that correspond to magic numbers
     */
    private static String convertMagicNumbersToFileType(String magicNumbers){
        return Types.returnFileType(magicNumbers);
    }

    /**
     * Method read first 4 bytes of file which are 'magic numbers' and converts
     * to String representation of HEX signature of file
     * @param file input file to read
     * @return String representation of HEX signature of file
     */
    private static String getMagicNumbers(File file) {
        StringBuilder magicNumbers = new StringBuilder();
        try {
            DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            for (int i = 0; i < 4; i++) {
                int byteRead = input.read();
                String s = Integer.toHexString(byteRead);
                magicNumbers.append(s);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return magicNumbers.toString().toUpperCase();
    }

    /**
     * Checks whether input file is a text file
     * @param file input file to check
     * @return true if it's text file, false if not
     */
    private static boolean checkIfTextFile(File file){
        String magicNumbers = getMagicNumbers(file);
        if (magicNumbers.startsWith(Types.TXT_UTF8)){
            return true;
        } else if(magicNumbers.startsWith(Types.TXT_UTF16_BigEndian)){
            return true;
        } else return magicNumbers.startsWith(Types.TXT_UTF16_LittleEndian);
    }

    /**
     * Returns text extension of input file
     * @param file input file to check
     * @return String representation of file extension
     */
    private static String getFileExtension(File file) {
        String fileExtension = "";
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                fileExtension = name.substring(name.lastIndexOf(".") + 1);
            }
        } catch (Exception e) {
            fileExtension = "";
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }
        return fileExtension;
    }

    public static File convert(MultipartFile file)
    {
        File convFile = new File(file.getOriginalFilename());
        try {
            convFile.createNewFile();
            FileOutputStream fos = new FileOutputStream(convFile);
            fos.write(file.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convFile;
    }
}
