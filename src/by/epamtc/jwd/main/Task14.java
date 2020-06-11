package by.epamtc.jwd.main;

public class Task14 {
    private static int getLengthOfShortestWord(String str) {
        String[] tokens = str.split(" ");
        int minLength = Integer.MAX_VALUE;

        for (String token : tokens) {
            minLength = Math.min(minLength, token.length());
        }

        return minLength;
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        int ans = getLengthOfShortestWord(str);

        System.out.printf("string: %s\nlength of the shortest word: %s\n", str, ans);
    }
}
