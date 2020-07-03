package by.epamtc.jwd.main;

import by.epamtc.jwd.util.Pair;

public class Task2 {
    private static Pair<Double, Double> countPercentageOfLowercaseAndUppercase(String str) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isLowerCase(current)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(current)) {
                uppercaseCount++;
            }
            // else there are symbols like .,?! and other
        }

        double lowercasePercentage = 1d * lowercaseCount / str.length();
        double uppercasePercentage = 1d * uppercaseCount / str.length();

        return new Pair<>(lowercasePercentage, uppercasePercentage);
    }

    public static void main(String[] args) {
        String str = "Where there's a will, there's a way.";
        Pair<Double, Double> ans = countPercentageOfLowercaseAndUppercase(str);

        System.out.printf("%f %f\n", ans.getFirst(), ans.getSecond());
    }
}
