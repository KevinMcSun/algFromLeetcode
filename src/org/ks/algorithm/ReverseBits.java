package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/27.
 */
public class ReverseBits {
    public static int reverseBits(int n) {
        n &= 0xFFFFFFFF;
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret = (ret * 2) + (n & 0x1);
            n /= 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-1 & 0xFFFFFFFF));
        System.out.println(reverseBits(-1));
    }
}
