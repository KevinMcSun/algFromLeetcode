// Source : https://leetcode.com/problems/zigzag-conversion/
// Inspired by : http://www.jiuzhang.com/solutions/balanced-binary-tree/
// Author : Kevin Sun
// Date   : 2016-10-02

/*
 *  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *  (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R

 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". */

package org.ks.algorithm;

/**
 * Created by Kevin on 10/2/2016.
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {

        if (numRows == 1)
            return s;

        int len = s.length();
        int times = len / (numRows + numRows - 2);
        int tailLen = len % (numRows + numRows - 2);
        StringBuilder stringBuilder = new StringBuilder("");
        char zzArr[][] = new char[numRows][(times + 1) * (numRows - 1)];

        int k = 0;
        boolean tag = false;
        boolean clo = true;
        boolean dig = false;

        for (int i = 0; i < (times + 1) * (numRows - 1);){
            if (clo){
                for (int j = 0; j < numRows;){
                    if (k < s.length())
                        zzArr[j][i] = s.charAt(k++);
                    j++;
                    if (j < numRows -1){
                        clo = true;
                        dig = false;
                    }
                    if (j == numRows - 1){
                        clo = false;
                        dig = true;
                    }
                }
            }
            if (dig){
                for (int j = numRows - 1; j > 0;) {
                    j--;
                    i++;
                    if (j > 0 & k < s.length())
                        zzArr[j][i] = s.charAt(k++);
                    if (j > 0){
                        clo = false;
                        dig = true;
                    }
                    if (j == 0){
                        clo = true;
                        dig = false;
                    }
                }
            }
            if (k == s.length())
                break;
        }

        for (int i = 0; i < zzArr.length; i++){
            for (int j = 0; j < zzArr[i].length; j++){
                if (zzArr[i][j] >= '!' && zzArr[i][j] <= '~')
                    stringBuilder.append(zzArr[i][j]);
            }
        }

        print2DArr(zzArr);

        return stringBuilder.toString();
    }

    void print2DArr(char arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        zigZagConversion.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5);
    }

}
