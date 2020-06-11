package by.epamtc.jwd.main;

public class Task18 {
    private static String addSpacesToString(String str, int index, int count) {
        if (index < 0 || index >= str.length())
            return str;

        StringBuilder strToInsert = new StringBuilder();
        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < count; i++) {
            strToInsert.append(" ");
        }

        return result.insert(index, strToInsert).toString();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        int index = 5;
        int count = 10;
        String ans = addSpacesToString(str, index, count);

        System.out.printf("string: %s\nwith additional spaces: %s\n", str, ans);
    }
}
