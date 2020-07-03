package by.epamtc.jwd.main;

public class Task19 {
    private static boolean isPalindrome(String str) {
        final String SPLIT_REGEX = "[^\\w']+";

        str = str.replaceAll(SPLIT_REGEX, "");
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        String str = "Live not on evil.";
        boolean ans = isPalindrome(str);

        System.out.printf("string: %s\nis palindrome: %b\n", str, ans);
    }
}
