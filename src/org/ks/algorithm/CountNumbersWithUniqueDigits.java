package org.ks.algorithm;


public class CountNumbersWithUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;

        if (n == 1)
            return 10;

        return countNumbersWithUniqueDigits(n - 1) + CNT(n);
    }

    public static int CNT(int n) {
        int res = 9;
        for (int i = 1; i < n ; i++) {
            res *= (10 - i);
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + "*********" + countNumbersWithUniqueDigits(i));
        }
    }
}
