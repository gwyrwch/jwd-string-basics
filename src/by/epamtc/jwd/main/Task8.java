package by.epamtc.jwd.main;

public class Task8 {
    private static String copySubstring(String str, int begin, int end) {
        if ((begin < 0 || begin >= str.length()) || (end < 0 || end >= str.length()) || begin > end) {
            return null;
        }

        return str.substring(begin, end);
    }


    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        int begin = 0;
        int end = 3;

        String ans = copySubstring(str, begin, end);
        if (ans == null) {
            System.out.println("Incorrect begin or end was given.");
            return;
        }

        System.out.printf("string: %s\nsubstr [%d, %d]: %s\n", str, begin, end, ans);
    }
}
