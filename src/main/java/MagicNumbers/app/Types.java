package MagicNumbers.app;

class Types {

    static final String TXT_UTF8 = "EFBBBF";
    static final String TXT_UTF16_BigEndian = "FEFF";
    static final String TXT_UTF16_LittleEndian = "FFFE";

        static String returnFileType(String magicNumbers){
            switch (magicNumbers){
                case "FFD8FF": return "JPG";
                case "FFD8FFE0": return "JPG";
                case "FFD8FFDB": return "JPG";
                case "FFD8FFE1": return "JPG";
                case "47494638": return "GIF";
                case "89504E47": return "PNG";
                case "EFBBBF" : return "TXT_UTF8";
                case "FEFF" : return "TXT_UTF16_BigEndian";
                case "FFFE" : return "TXT_UTF16_LittleEndian";
            }
        return "UnknownType";
    }
}
