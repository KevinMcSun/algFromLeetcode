package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/20.
 */
public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int i = 0;
        for (; i < v1.length && i < v2.length; i++) {
            if (StringtoInteger.myAtoi(deleteHeadZeros(v1[i])) > StringtoInteger.myAtoi(deleteHeadZeros(v2[i])))
                return 1;
            else if (StringtoInteger.myAtoi(v1[i]) == StringtoInteger.myAtoi(v2[i]))
                continue;
            else
                return -1;
        }

        if (v1.length > v2.length) {
            while (i < v1.length && StringtoInteger.myAtoi(v1[i]) == 0) {
                i++;
                continue;
            }
            if (i == v1.length)
                return 0;
            return 1;
        }
        else if (v1.length == v2.length)
            return 0;
        else {
            while (i < v2.length && StringtoInteger.myAtoi(v2[i]) == 0) {
                i++;
                continue;
            }
            if (i == v2.length)
                return 0;
            return -1;
        }
    }

    public static String deleteHeadZeros(String s) {
        while (s.charAt(0) == '0' && s.length() >= 2) {
            s = s.substring(1);
        }
        return s;
    }

    public static void main(String[] args) {
        String s1 = "1.00000000000000000000001";
        String s2 = "1.000000000000000000000010";

        System.out.println(compareVersion(s1, s2));
    }
}
