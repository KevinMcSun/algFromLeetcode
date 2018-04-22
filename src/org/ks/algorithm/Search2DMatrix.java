package org.ks.algorithm;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null)
            return false;

        if (matrix.length == 0)
            return false;

        int elemCnt = 0;
        for (int i = 0; i < matrix.length; i++) {
            elemCnt += matrix[i].length;
        }
        if (elemCnt == 0)
            return false;

        if (target < matrix[0][0])
            return false;
        if (target > matrix[matrix.length - 1][matrix[0].length - 1])
            return false;

        int top = 0;
        int bottom = matrix.length - 1;
        int midRow = top + (bottom - top) / 2;

        while (top <= bottom) {
            if (matrix[midRow][0] == target) {
                return true;
            } else if (matrix[midRow][0] > target) {
                bottom = midRow - 1;
                midRow = top + (bottom - top) / 2;
                continue;
            } else {
                top = midRow + 1;
                midRow = top + (bottom - top) / 2;
                continue;
            }
        }

        if (top < 0)
            top = 0;
        if (top > matrix.length - 1)
            top = matrix.length - 1;

        if (matrix[top][0] > target)
            top--;

        int left = 0;
        int right = matrix[top].length - 1;
        int midCol = left + (right - left) / 2;
        while (left <= right) {
            if (matrix[top][midCol] == target) {
                return true;
            } else if (matrix[top][midCol] > target) {
                right = midCol - 1;
                midCol = left + (right - left) / 2;
            } else {
                left = midCol + 1;
                midCol = left + (right - left) / 2;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maxtrix = new int[][]{
                {0, 1, 2, 3, 5},
                {6, 8, 9, 10, 11},
                {12, 13, 14, 16, 17},
                {18, 19, 20, 21, 23},
                {24, 26, 27, 28, 29},
                {30, 31, 32, 33, 34},
                {36, 37, 38, 39, 40},
                {42, 44, 45, 46, 47}
        };
        System.out.println(searchMatrix(maxtrix, 41));
        return;
    }
}
