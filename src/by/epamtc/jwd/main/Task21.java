package by.epamtc.jwd.main;

public class Task21 {
    private static String addStrings(String fNum, String sNum) {
        StringBuilder ans = new StringBuilder();

        int carry = 0;
        int fIndex = fNum.length() - 1;
        int sIndex = sNum.length() - 1;

        while(fIndex >= 0 || sIndex >= 0) {
            int digit;
            if (fIndex < 0) {
                digit = sNum.charAt(sIndex) - '0' + carry;

                carry = digit / 10;
                digit %= 10;
                ans.append(digit);

                sIndex--;
            } else if (sIndex < 0) {
                digit = fNum.charAt(fIndex) - '0' + carry;

                carry = digit / 10;
                digit %= 10;
                ans.append(digit);

                fIndex--;
            } else {
                digit = fNum.charAt(fIndex) - '0' + sNum.charAt(sIndex) - '0' + carry;

                carry = digit / 10;
                digit %= 10;
                ans.append(digit);

                fIndex--;
                sIndex--;
            }
        }

        if (carry == 1) {
            ans.append("1");
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String fNum = "19209402342999";
        String sNum = "2436235999";

        String ans = addStrings(fNum, sNum);
        System.out.printf("%s + %s = %s\n", fNum, sNum, ans);
    }
}

// 19211838578998
// 19211838578998
