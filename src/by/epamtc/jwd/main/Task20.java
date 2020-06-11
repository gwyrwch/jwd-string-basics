package by.epamtc.jwd.main;

public class Task20 {
    private static String replaceSubstring(String str, String toReplace, String replacement) {
        return str.replace(toReplace, replacement);
    }

    public static void main(String[] args) {
        String str = "Practice makes perfect.";
        String substr = "Practice";
        String replacement = "Good deeds";
        String ans = replaceSubstring(str, substr, replacement);

        System.out.printf("string: %s\nwith substr replaced: %s\n", str, ans);
    }
}
