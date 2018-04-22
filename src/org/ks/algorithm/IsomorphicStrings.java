package org.ks.algorithm;

import java.util.HashMap;

/**
 * Created by Kevin on 2016/12/19.
 */
public class IsomorphicStrings {
    public static boolean _isIsomorphic(String s, String t) {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;

        HashMap<Character, Integer> dist = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!dist.containsKey(s.charAt(i))){
                dist.put(s.charAt(i), t.charAt(i) - s.charAt(i));
            } else {
                if (dist.get(s.charAt(i)) != t.charAt(i) - s.charAt(i))
                    return false;
                else
                    continue;
            }
        }

        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        return _isIsomorphic(s, t) && _isIsomorphic(t, s);
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }

}
