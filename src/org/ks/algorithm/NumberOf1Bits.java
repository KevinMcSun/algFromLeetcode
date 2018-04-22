package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/13.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int cnt = 0;
        for (; n != 0; cnt++) {
           n &= n - 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        System.out.println(numberOf1Bits.hammingWeight(214748367));
    }
}
