package by.epamtc.jwd.main;

public class Task23 {
    private static String removeExtraSpaces(String str) {
        final String SPACE_SEQUENCE_REGEX = "\\s+";

        str = str.replaceAll(SPACE_SEQUENCE_REGEX," ");

        return str.trim();
    }

    public static void main(String[] args) {
        String str = "  Where there's a will,   there's   a way. ";
        String ans = removeExtraSpaces(str);

        System.out.printf("string: %s\nwithout extra spaces: %s\n", str, ans);
    }
}
