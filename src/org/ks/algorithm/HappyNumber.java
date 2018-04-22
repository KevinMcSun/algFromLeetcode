package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/5.
 */
public class HappyNumber {
    public static int squares(int n) {
        int result = 0;
        int sq = 0;
        for (; n > 0; n /= 10) {
            sq = n % 10;
            result += (sq * sq);
        }
        return result;
    }

    public static boolean isHappy(int n) {
        if (n == 1)
            return true;

        while (n != 1) {
            System.out.println(n);
            n = squares(n);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1000 - 1));
    }
}
