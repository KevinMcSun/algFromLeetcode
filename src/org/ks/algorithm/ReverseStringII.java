package org.ks.algorithm;

/**
 * Created by Kevin on 2017/3/23.
 */
public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        if (s == null)
            return s;
        if (k <= 0)
            return s;

        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % (2 * k) == 0 ) {
                s = reverseSubStr(s, i - 2 * k + 1, i - k);
            } else {
                if (i == s.length() - 1) {
                    if (s.length() % (2 * k) < k) {
                        s = reverseSubStr(s, s.length() - s.length() % k, i);
                    }else {
                        s = reverseSubStr(s, s.length() - s.length() % (2 * k) - 1, s.length() - s.length() % k - 1);
                    }
                } else {
                    continue;
                }
            }
        }

        return s;
    }

    public static void swap(char[] arr, int begin, int end) {
        while(begin < end) {
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }

    public static String reverseSubStr(String str, int begin, int end) {
        if (begin < 0)
            begin = 0;
        if (end >= str.length())
            end = str.length() - 1;

        char[] arr = str.toCharArray();

        swap(arr, begin, end);

        return new String(arr);
    }

    public static void main(String[] args) {
        for (int i = 2; i < 6; i++) {
            System.out.println("abcdefghijklmnopqrstuvwxyz");
            System.out.println(reverseStr("abcdefghijklmnopqrstuvwxyz", 5));
        }
    }
}
