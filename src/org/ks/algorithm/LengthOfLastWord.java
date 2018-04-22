package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/16.
 */

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example,
 * Given s = "Hello World",
 * return 5.
 *
 */

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;
        if (s.length() == 1) {
            if (s == " ")
                return 0;
            return 1;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        if (s.lastIndexOf(' ') != -1)
            return s.substring(s.lastIndexOf(' ') + 1).length();
        else
            return s.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
