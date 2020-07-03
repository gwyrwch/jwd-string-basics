package by.epamtc.jwd.main;

public class Task22 {
    private static String removeWordsWithGivenLength(String str, int length) {
        final String SPLIT_REGEX = "[^\\w']+";

        String[] tokens = str.split(SPLIT_REGEX);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() != length) {
                result.append(tokens[i]);

                if (i != tokens.length - 1) {
                    result.append(' ');
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        int length = 4;

        String ans = removeWordsWithGivenLength(str, length);
        System.out.printf("string: %s\nwithout words with length %d: %s\n", str, length, ans);
    }
}
