package by.epamtc.jwd.main;

public class Task4 {
    private static double countCharacterFrequency(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return 1d * count / str.length();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        char ch = 'e';
        double ans = countCharacterFrequency(str, ch);

        System.out.printf("string: %s\nfrequency of char '%c': %f", str, ch, ans);

    }
}
