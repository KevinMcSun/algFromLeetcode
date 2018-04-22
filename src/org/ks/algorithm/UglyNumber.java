package org.ks.algorithm;

/**
 * Created by Kevin on 2016/11/29.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num == 1)
            return true;
        while (num != 0 && num % 2 == 0)
            num /= 2;
        while (num != 0 && num % 3 == 0)
            num /= 3;
        while (num != 0 && num % 5 == 0)
            num /= 5;

        if (num == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + uglyNumber.isUgly(i));
        }
    }
}
