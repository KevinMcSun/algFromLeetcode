package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/26.
 */
public class RotateFunction {
    public static int maxRotateFunction(int[] A) {
        int len = A.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            max += i * A[i];
        }
        for (int i = 1; i < len; i++) {
            RotateArray.rotate(A, 1);
            int F = 0;
            for (int j = 0; j < len; j++) {
                F += j * A[j];
            }
            if (F > max)
                max = F;
            else
                continue;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[100000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i;
            System.out.print(i + ", ");
        }

        System.out.println(maxRotateFunction(A));
    }
}
