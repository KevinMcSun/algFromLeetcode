package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2016/12/13.
 */
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();

        int pLen = p.length();

        for (int i = 0; i <= s.length() - pLen; i++) {
            String subStr = s.substring(i, i + pLen);
            boolean isTrue = true;
            for (int j = 0; j < pLen; j++) {
                if (subStr.indexOf(p.charAt(j)) == -1) {
                    isTrue = false;
                    break;
                } else {
                    subStr = subStr.substring(0, subStr.indexOf(p.charAt(j))) + subStr.substring(subStr.indexOf(p.charAt(j)) + 1);
                    continue;
                }
            }
            if (isTrue)
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        System.out.println(findAllAnagramsInAString.findAnagrams("baa", "aa"));
    }
}
