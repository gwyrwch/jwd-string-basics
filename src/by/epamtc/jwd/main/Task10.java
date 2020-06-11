package by.epamtc.jwd.main;

public class Task10 {
    private static int countSubstringEntries(String str, String substr) {
        int index = 0;
        int count = 0;

        while (true) {
            index = str.indexOf(substr, index);
            if (index == -1)
                break;
            index += substr.length();

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        String substr = "ere";
        int ans = countSubstringEntries(str, substr);

        System.out.printf("string: %s\nsubstr '%s' count: %d\n", str, substr, ans);
    }
}
