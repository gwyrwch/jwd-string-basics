package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.buildStringFromArray;

public class Task13 {
    private static String replaceCharactersInLongestWord(String str) {
        String[] tokens = str.split(" ");
        int indexOfLongestWord = 0;
        int maxLength = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() > maxLength) {
                indexOfLongestWord = i;
                maxLength = tokens[i].length();
            }
        }

        tokens[indexOfLongestWord] = tokens[indexOfLongestWord].replaceAll("a", "b");

        return buildStringFromArray(tokens);
    }
    public static void main(String[] args) {
        String str = "Practice makes perfect.";
        String ans = replaceCharactersInLongestWord(str);

        System.out.printf("string: %s\n'b' without 'a' in longest word : %s\n", str, ans);
    }
}
