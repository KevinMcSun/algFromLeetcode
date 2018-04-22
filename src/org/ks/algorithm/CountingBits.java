package org.ks.algorithm;

import java.util.Arrays;

/**
 * Created by Kevin on 2017/2/27.
 */
public class CountingBits {
    public static int[] countBits(int num) {
        int[] rs = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            rs[i] = rs[i & (i - 1)] + 1;
        }

        return rs;
    }

    public static void main(String[] args) {
        System.out.println(10 & 9);
        return;
    }
}
