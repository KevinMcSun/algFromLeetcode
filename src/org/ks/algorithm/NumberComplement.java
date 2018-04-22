package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/20.
 */
public class NumberComplement {
    public static int findComplement(int num) {
        int[] arr = new int[32];

        for (int i = 0; i < 32; i++) {
            arr[i] = num % 2;
            num /= 2;
        }
        int i = 31;

        while (arr[i--] == 0);

        for (int k = i + 1; k >= 0; k--) {
            if (arr[k] == 0)
                arr[k] = 1;
            else
                arr[k] = 0;
        }

        int r = 0;

        for (int j = 0; j < 32; j++) {
            if (arr[j] == 0)
                continue;
            else
                r += arr[j] * (int)Math.pow(2, j);
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
