package by.epamtc.jwd.main;

public class Task6 {
    private static String insertSubstring(String str, String strToInsert, int index) {
        if (index < 0 || index >= str.length()) {
            return null;
        }
        StringBuilder res = new StringBuilder(str);
        res.insert(index, strToInsert);

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String strToInsert = "12345";
        int index = 2;

        String ans = insertSubstring(str, strToInsert, index);
        if (ans == null) {
            System.out.println("Incorrect index was given");
            return;
        }

        System.out.printf("string: %s\nstring with substr: %s\n", str, ans);
    }
}
