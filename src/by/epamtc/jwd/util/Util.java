package by.epamtc.jwd.util;

public class Util {
    public static String buildStringFromArray(String[] tokens) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            result.append(tokens[i]);

            if (i != tokens.length - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }
}
