package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.buildStringFromArray;

public class Task16 {
    private static String swapWords(String str, String fWord, String sWord) {
        final String SPLIT_REGEX = "[^\\w']+";

        String[] tokens = str.split(SPLIT_REGEX);
        int fWordIndex = -1;
        int sWordIndex = -1;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(fWord)) {
                fWordIndex = i;
            }

            if (tokens[i].equals(sWord)) {
                sWordIndex = i;
            }
        }

        if (fWordIndex == -1 || sWordIndex == -1) {
            return str;
        }

        tokens[fWordIndex] = sWord;
        tokens[sWordIndex] = fWord;

        return buildStringFromArray(tokens);
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String fWord = "will";
        String sWord = "way";

        String ans = swapWords(str, fWord, sWord);

        System.out.printf("string: %s\nwith swapped words: %s\n", str, ans);
    }
}
