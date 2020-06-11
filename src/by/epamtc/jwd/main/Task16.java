package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.buildStringFromArray;

public class Task16 {
    private static String swapWords(String str, String fWord, String sWord) {
        String[] tokens = str.split("\\W+");
        int fWordIndex = 0;
        int sWordIndex = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(fWord)) {
                fWordIndex = i;
            }
            if (tokens[i].equals(sWord)) {
                sWordIndex = i;
            }
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
