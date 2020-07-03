package by.epamtc.jwd.main;

public class Task24 {
    private static String[] splitStringIntoWords(String str) {
        final String SPLIT_REGEX = "[^\\w']+";

        return str.split(SPLIT_REGEX);
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String[] ans = splitStringIntoWords(str);

        System.out.printf("Words from string '%s':\n", str);
        for (String s: ans) {
            System.out.println(s);
        }
    }
}
