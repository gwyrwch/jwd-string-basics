package by.epamtc.jwd.main;

public class Task17 {
    private static String deleteLastWord(String str) {
        int indexOfLastWord = str.lastIndexOf(' ');

        return str.substring(0, indexOfLastWord);
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String ans = deleteLastWord(str);

        System.out.printf("string: %s\nwithout last word: %s\n", str, ans);
    }
}
