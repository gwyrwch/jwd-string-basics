package by.epamtc.jwd.main;

import by.epamtc.jwd.util.Pair;

public class Task2 {
    private static Pair<Double, Double> countPercentageOfLowercaseAndUppercase(String str) {
        int lowercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                lowercaseCount += 1;
            }
        }

        double lowercasePercentage = 1d * lowercaseCount / str.length();
        double uppercasePercentage = 1d * (str.length() - lowercaseCount) / str.length();

        return new Pair<>(lowercasePercentage, uppercasePercentage);
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        Pair<Double, Double> ans = countPercentageOfLowercaseAndUppercase(str);

        System.out.printf("%f %f\n", ans.getFirst(), ans.getSecond());
    }
}
