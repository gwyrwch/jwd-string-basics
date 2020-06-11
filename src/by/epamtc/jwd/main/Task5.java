package by.epamtc.jwd.main;

public class Task5 {
    private static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String ans = reverse(str);

        System.out.printf("string: %s\nreversed string: %s\n", str, ans);
    }
}
