package by.epamtc.jwd.main;

import by.epamtc.jwd.util.Pair;

public class Task1 {
    private static Pair<String, String> splitOddAndEvenCharacters(String str) {
        StringBuilder oddCharacters = new StringBuilder();
        StringBuilder evenCharacters = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) % 2 == 0) {
                evenCharacters.append(str.charAt(i));
            } else {
                oddCharacters.append(str.charAt(i));
            }
        }

        return new Pair<>(oddCharacters.toString(), evenCharacters.toString());
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        Pair<String, String> ans = splitOddAndEvenCharacters(str);

        System.out.printf("string: %s\nodd chars: %s\neven chars: %s\n", str, ans.getFirst(), ans.getSecond());
    }

}
