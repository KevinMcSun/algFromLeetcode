package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/15.
 */
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if (n <= 1)
            return n;
        int start = (int)Math.sqrt(n + 1) * (int)Math.sqrt(2) - 2;
        for (int i = start; i < n; i++) {
            if ((i * (i + 1) <= 2 * n) && ((i + 1) * (i + 2) > 2 * n))
                return i;
            continue;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
