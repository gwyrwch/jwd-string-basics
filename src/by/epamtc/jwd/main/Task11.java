package by.epamtc.jwd.main;

public class Task11 {
    private static String reverseWords(String str) {
        StringBuilder res = new StringBuilder();
        String[] tokens = str.split("[^\\w']+");


        for (int i = tokens.length - 1; i >= 0; i--) {
            res.append(tokens[i]);
            if (i != 0) {
                res.append(' ');
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String ans = reverseWords(str);

        System.out.printf("string: %s\nwith reversed words: %s\n", str, ans);
    }
}
