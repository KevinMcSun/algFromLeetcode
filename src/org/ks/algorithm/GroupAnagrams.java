package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null)
            return null;

        List<List<String>> reslut = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            boolean found = false;
            for (int j = 0; j < reslut.size(); j++) {
                List<String> tList = reslut.get(j);
                if (isSameAnagram(tList.get(0), str)) {
                    tList.add(str);
                    found = true;
                } else {
                    continue;
                }
            }
            if (!found) {
                List<String> tList = new ArrayList<>();
                tList.add(str);
                reslut.add(tList);
            }
        }
        return reslut;
    }

    public static boolean isSameAnagram(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        } else if (s1 != null && s2 == null) {
            return false;
        } else if (s1 == null && s2 != null) {
            return false;
        } else {
            if (s1.length() != s2.length()) {
                return false;
            } else {
                for (int i = 0; i < s1.length();) {
                    char ch = s1.charAt(i);
                    if (s2.indexOf(ch) == -1)
                        return false;
                    else {
                        s1 = s1.replaceFirst(String.valueOf(ch),"");
                        s2 = s2.replaceFirst(String.valueOf(ch),"");
                    }
                }
                return true;
            }
        }
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(isSameAnagram("ace","eat"));
        return;
    }
}
