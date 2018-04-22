package org.ks.algorithm;

import java.util.Arrays;

/**
 * Created by Kevin on 2016/12/15.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            boolean carry = false;
            int val = digits[i] + 1;
            if (val < 10) {
                digits[i] = val;
                break;
            }
            else {
                digits[i] = val - 10;
                if (i == 0) {
                    int[] r = new int[digits.length + 1];
                    int[] c = {1};
                    System.arraycopy(c, 0, r, 0, c.length);
                    System.arraycopy(digits, 0, r, c.length, digits.length);
                    return r;
                }
                continue;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {0, 0, 9,9,9,9,9};
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
