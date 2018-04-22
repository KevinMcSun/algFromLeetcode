package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/10.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 **************************************************************************************
 * Example 1:
 *
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 ****************************************************************************************
 *
 */

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        int[][] arr = new int[map.size()][2];
        int i = 0;
        for (Map.Entry m : map.entrySet()) {
            arr[i][0] = (int) ((char)m.getKey() - 'a');
            arr[i++][1] = (int) m.getValue();
        }

        for (int j = 0; j < arr.length; j++) {
            boolean swap = false;
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k][1] < arr[k + 1][1]) {
                    swap = true;
                    int t = arr[k][0];
                    arr[k][0] = arr[k + 1][0];
                    arr[k + 1][0] = t;

                    t = arr[k][1];
                    arr[k][1] = arr[k + 1][1];
                    arr[k + 1][1] = t;
                }
            }
            if (!swap)
                break;
        }

        StringBuilder sb = new StringBuilder("");
        for (int j = 0; j < arr.length; j++) {

            for (int k = 0; k < arr[j][1]; k++)
                sb.append((char)(arr[j][0] + 'a'));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("cccaaaAAbBBKKMMBBhhmhhhhheebbbbff"));
    }
}
