package org.ks.algorithm;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kevin on 2017/3/23.
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        if (pattern.length() != str.split(" ").length)
            return false;
        String[] words = str.split(" ");

        boolean posDir = true;

        Map<Character, String> posMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            if (!posMap.containsKey(pattern.charAt(i))) {
                posMap.put(pattern.charAt(i), words[i]);
            } else {
                if (posMap.get(pattern.charAt(i)).equals(words[i]))
                    continue;
                else
                    posDir = false;
            }
        }

        boolean negDir = true;
        Map<String, Character> negMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!negMap.containsKey(words[i])) {
                negMap.put(words[i], pattern.charAt(i));
            }else {
                if (negMap.get(words[i]) == pattern.charAt(i))
                    continue;
                else
                    negDir = false;
            }
        }

        return posDir && negDir;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
}
