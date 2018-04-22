package org.ks.algorithm;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        if (matrix == null)
            return;
        if (matrix.length == 0)
            return;

        int begin = 0;
        int end = matrix.length - 1;
        while (begin < end) {
            for (int i = 0; i < matrix.length; i++) {
                int tmp = matrix[begin][i];
                matrix[begin][i] = matrix[end][i];
                matrix[end][i] = tmp;
            }
            begin++;
            end--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null)
            return;
        if (matrix.length == 0)
            return;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("-----before rotate------");
        printMatrix(matrix);
        rotate(matrix);
        System.out.println("-----after rotate-------");
        printMatrix(matrix);
    }
}
