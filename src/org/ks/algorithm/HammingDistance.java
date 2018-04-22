package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/19.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        return x & y;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
