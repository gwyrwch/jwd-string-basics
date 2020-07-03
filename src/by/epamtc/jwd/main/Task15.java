package by.epamtc.jwd.main;

public class Task15 {
    private static int countWordsAmount(String str) {
        final String SPLIT_REGEX = "[^\\w']+";

        return str.split(SPLIT_REGEX).length;
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        int ans = countWordsAmount(str);

        System.out.printf("string: %s\nwords amount: %s\n", str, ans);
    }
}
