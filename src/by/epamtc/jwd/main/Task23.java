package by.epamtc.jwd.main;

public class Task23 {
    static String removeExtraSpaces(String str) {
        str = str.replaceAll("\\s+"," ");

        return str.trim();
    }

    public static void main(String[] args) {
        String str = "  Where there's a will,   there's   a way. ";
        String ans = removeExtraSpaces(str);

        System.out.printf("string: %s\nwithout extra spaces: %s\n", str, ans);
    }
}
