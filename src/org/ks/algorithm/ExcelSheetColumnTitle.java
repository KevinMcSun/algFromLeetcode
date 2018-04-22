package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/23.
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        String[] digit = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder reslut = new StringBuilder("");

        while (n > 0) {
            reslut.insert(0, digit[(n - 1 ) % 26]);
            n = (n - 1) / 26;
        }

        return reslut.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 78; i++) {
            System.out.println(i + "->" + convertToTitle(i));
        }
    }
}
