package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/24.
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int l = 0;
        int h = 46340; // (int)Math.sqrt(Integer.MAX_VALUE);

        while (l <= h) {
            if (l * l == num ||h * h == num)
                return true;

            int m = l + (h - l) / 2;

            if (m * m > num)
                h = m - 1;
            else if (m * m == num)
                return true;
            else
                l = m + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 2146225; i <= 2146225; i++)
            System.out.println(i + " " + isPerfectSquare(i));
    }
}
