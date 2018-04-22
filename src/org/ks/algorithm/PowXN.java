package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/15.
 */
public class PowXN {
    public double myPow(double x, int n) {
        boolean sign = false;
        int exp = n;

        if (n < 0) {
            exp = -n;
            sign = true;
        }

        double result = 1.0;
        while (exp != 0) {
            if ((exp & 1) == 1) {
                result *= x;
            }
            exp >>= 1;
            x *= x;
        }

        return sign ? 1 / result : result;
    }
    public static void main(String[] args) {
        System.out.println(Math.pow(0.1, 10));
    }
}
