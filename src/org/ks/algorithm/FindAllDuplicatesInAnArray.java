package org.ks.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Kevin on 2017/1/19.
 */
public class FindAllDuplicatesInAnArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (!map.containsKey(n))
                map.put(n, 1);
            else {
                result.add(n);
                //map.put(n, 2)
            }
        }

        return result;
    }
}
