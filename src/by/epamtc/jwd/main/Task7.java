package by.epamtc.jwd.main;

public class Task7 {
    private static String deleteSubstring(String str, String substr) {
        if (!str.contains(substr)) {
            return null;
        }

        // all substring occurrences are replaced
        return str.replace(substr, "");
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String strToDelete = "way";

        String ans = deleteSubstring(str, strToDelete);

        if (ans == null) {
            System.out.println("No such substring in given string");
            return;
        }

        System.out.printf("string: %s\nstring without substr: %s\n", str, ans);
    }
}
