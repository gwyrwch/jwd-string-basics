package by.epamtc.jwd.main;

public class Task3 {
    private static String removeDuplicateCharacters(String str) {
        StringBuilder strWithoutDuplicates = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (strWithoutDuplicates.toString().indexOf(str.charAt(i)) == -1) {
                strWithoutDuplicates.append(str.charAt(i));
            }
        }

        return strWithoutDuplicates.toString();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String ans = removeDuplicateCharacters(str);

        System.out.printf("string: %s\nstring without duplicates: %s\n", str, ans);
    }
}
