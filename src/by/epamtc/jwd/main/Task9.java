package by.epamtc.jwd.main;

public class Task9 {
    private static int getStringLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        int length = getStringLength(str);

        System.out.printf("string: %s\nlength: %d\n", str, length);
    }
}
