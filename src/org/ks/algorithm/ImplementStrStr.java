package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/16.
 */
public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;

        if (haystack.equals(needle))
            return 0;
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("This is the test case", "se"));
    }
}
