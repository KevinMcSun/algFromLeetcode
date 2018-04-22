package org.ks.algorithm;

/**
 * Created by Kevin on 10/11/2016.
 */
public class LongestPalindromicSubstring {
    public String findPalindrome(String s, int left, int right) {
        int n = s.length();
        int l = left;
        int r = right;
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n<=1) return s;

        String longest = "";

        String str;
        for (int i=0; i<n-1; i++) {
            str = findPalindrome(s, i, i);
            if (str.length() > longest.length()){
                longest = str;
            }
            str = findPalindrome(s, i, i + 1);
            if (str.length() > longest.length()){
                longest = str;
            }
        }

        return longest;
    }

    public static void main(String[] args){
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome(""));
    }

}
