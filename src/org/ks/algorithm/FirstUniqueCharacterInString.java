package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/8.
 */
public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        if (s.length() <= 1)
            return s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInString firstUniqueCharacterInString = new FirstUniqueCharacterInString();
        System.out.println(firstUniqueCharacterInString.firstUniqChar("loveleetcode"));
    }
}
