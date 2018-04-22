package org.ks.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kevin on 2017/2/24.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        if (ransomNote.length() == 0)
            return true;

        Map<Character, Integer> ransomNodeMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!ransomNodeMap.containsKey(ransomNote.charAt(i))) {
                ransomNodeMap.put(ransomNote.charAt(i), 1);
            } else {
                ransomNodeMap.put(ransomNote.charAt(i), ransomNodeMap.get(ransomNote.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (!magazineMap.containsKey(magazine.charAt(i))) {
                magazineMap.put(magazine.charAt(i), 1);
            } else {
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
            }
        }

        for (Map.Entry entry : ransomNodeMap.entrySet()) {
            if (!magazineMap.containsKey(entry.getKey()))
                return false;
            if ((int)entry.getValue() > magazineMap.get(entry.getKey()))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("affbba", "aaaabbbbfff"));
    }
}
