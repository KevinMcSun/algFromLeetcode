package org.ks.algorithm;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null)
            return null;

        if (matrix.length == 0)
            return new int[]{};

        int[] res = new int[matrix.length * matrix[0].length];
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0, j = 0;
        int k = 0;
        boolean direction = false; //true: ↙, false: ↗
        boolean left = false;
        while (i < row && j < col) {
            if (i == 1 && j == 2)
                System.out.println(i + " " + j);
            res[k++] = matrix[i][j];
            if (j == col - 1 && i < row) {
                if (!direction) {
                    i++;
                    direction = true;
                }
            } else if (i == row - 1 && j < col) {
                if (direction)
                    j++;
            } else if (i == 0 && j % 2 == 0) {
                if(!direction)
                    j++;
                continue;
            } else if (i == 0 && j % 2 == 1) {
                i++;
                j--;
                direction = true;
                continue;
            } else if (j == 0 && i % 2 == 0) {
                i--;
                j++;
                direction = false;
                continue;
            } else if (j == 0 && i % 2 == 1) {
                if (direction)
                    i++;
                continue;
            } else if ((i + j) % 2 == 0) {
                i--;
                j++;
                direction = false;
                continue;
            } else if ((i + j) % 2 == 1) {
                i++;
                j--;
                direction = true;
                continue;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};

        int[] res = findDiagonalOrder(matrix);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
