package by.epamtc.jwd.main;

public class Task17 {
    private static String deleteLastWord(String str) {
        str = str.trim();
        int indexOfLastWord = str.lastIndexOf(' ');
        if (indexOfLastWord == -1) {
            return str;
        }

        return str.substring(0, indexOfLastWord);
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String ans = deleteLastWord(str);

        System.out.printf("string: %s\nwithout last word: %s\n", str, ans);
    }
}
