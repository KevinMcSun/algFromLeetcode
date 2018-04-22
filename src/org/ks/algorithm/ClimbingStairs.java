package org.ks.algorithm;

import javax.crypto.Cipher;

/**
 * Created by Kevin on 2016/12/13.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1)
            return 1;

        if (n == 2)
            return 2;

        int p = 1;
        int q = 2;
        int r = 0;

        for (int i = 3; i <= n; i++) {
            r = p + q;
            p = q;
            q = r;
            System.out.print(r + " ");
        }

        return r;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(50));
    }
}
