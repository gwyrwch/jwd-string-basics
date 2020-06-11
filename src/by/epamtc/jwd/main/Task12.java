package by.epamtc.jwd.main;

public class Task12 {
    private static String replaceSpacesWithStars(String str) {
        return str.replaceAll(" ", "*");
    }

    public static void main(String[] args) {
        String str = "Where  there's a will,   there's a way.";
        String ans = replaceSpacesWithStars(str);

        System.out.printf("string: %s\nwith star spaces: %s\n", str, ans);
    }
}
