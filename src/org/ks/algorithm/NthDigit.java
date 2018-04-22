package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/16.
 */

/**
 * 9
 * 189
 * 2889
 * 38889
 * 488889
 * 5888889
 * 68888889
 * 788888889
 * 2036372536
 */

public class NthDigit {
    public static int countOfDigits(int n) {
        return (int)(n * Math.pow(10, n)) - (int)((Math.pow(10, n) - 1) / 9);
    }

    public static int fnd(int n, int startNumber,  int start, int digits) {
        if ((n - start) % digits == 0) {
            int k = startNumber + (n - start) / digits - 1;
            return k % 10;
        } else {
            int k = startNumber + (n - start) / digits;
            return (k / (int)(Math.pow(10, digits - (n - start) % digits))) % 10;
        }
    }

    public static int findNthDigit(int n) {
        if (n <= 9) {
            // All numbers have 1 digit for each. [1, 9]
            return n;
        } else if (n > 9 && n <= 189) {
            // All numbers have 2 digits for each. [10, 99]
            return fnd(n, 10, 9, 2);
        } else if (n > 189 && n <= 2889) {
            // All numbers have 3 digits for each. [100, 999]
            return fnd(n, 100, 189, 3);
        } else if (n > 2889 && n <= 38889) {
            // All numbers have 4 digits for each. [1000, 9999]
            return fnd(n, 1000, 2889, 4);
        } else if (n > 38889 && n <= 488889) {
            // All numbers have 5 digits for each. [10000, 99999]
            return fnd(n, 10000, 38889, 5);
        } else if (n > 488889 && n <= 5888889) {
            // All numbers have 6 digits for each. [100000, 999999]
            return fnd(n, 100000, 488889, 6);
        } else if (n > 5888889 && n <= 68888889) {
            // All numbers have 7 digits for each. [1000000, 9999999]
            return fnd(n, 1000000, 5888889, 7);
        } else if (n > 68888889 && n <= 788888889) {
            // All numbers have 8 digits for each. [10000000, 99999999]
            return fnd(n, 10000000, 68888889, 8);
        } else {
            // All numbers have 9 digits for each. [100000000, 999999999]
            return fnd(n, 100000000, 788888889, 9);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 300; i++) {
            System.out.print(findNthDigit(i));
        }
    }
}
