package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/13.
 */
public class Base7 {
    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder("");
        if (num == 0) {
            return "0";
        } else if (num > 0) {
            sb = convertTo7(num);
        } else {
            sb.append("-");
            num = -num;
            sb.append(convertTo7(num));
        }
        return sb.toString();
    }

    public static StringBuilder convertTo7(int num) {
        StringBuilder sb = new StringBuilder("");
        while (num > 0) {
            sb.insert(0, String.valueOf(num % 7));
            num /= 7;
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
}
