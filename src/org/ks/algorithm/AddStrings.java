package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/10.
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder("");
        boolean carry = false;
        for (int i = num1.length() - 1, j = num2.length() - 1 ; i >= 0 && j >= 0; i--, j--) {
            int t = 0;
            if (carry)
                t = num1.charAt(i) - '0' + num2.charAt(j) - '0' + 1;
            else
                t = num1.charAt(i) - '0' + num2.charAt(j) - '0';

            if (t >= 10)
                carry = true;
            else
                carry = false;

            if (carry)
                result.insert(0, String.valueOf((char)('0' + (t-10))));
            else
                result.insert(0, String.valueOf((char)('0' + t)));
        }


        if (num1.length() > num2.length()) {
            for (int i = num1.length() - num2.length() - 1; i >= 0; i--) {
                int t = 0;
                if (carry)
                    t = num1.charAt(i) - '0' + 1;
                else
                    t = num1.charAt(i) - '0';
                if (t >= 10)
                    carry = true;
                else
                    carry = false;

                if (carry)
                    result.insert(0, String.valueOf((char)('0' + (t-10))));
                else
                    result.insert(0, String.valueOf((char)('0' + t)));
            }
        }

        if (num2.length() > num1.length()) {
            for (int i = num2.length() - num1.length() - 1; i >= 0; i--) {
                int t = 0;
                if (carry)
                    t = num2.charAt(i) - '0' + 1;
                else
                    t = num2.charAt(i) - '0';
                if (t >= 10)
                    carry = true;
                else
                    carry = false;

                if (carry)
                    result.insert(0, String.valueOf((char)('0' + (t-10))));
                else
                    result.insert(0, String.valueOf((char)('0' + t)));
            }
        }

        if (carry)
            result.insert(0, '1');

        return result.toString();
    }

    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        System.out.println(addStrings.addStrings("999929", "72"));
    }
}
