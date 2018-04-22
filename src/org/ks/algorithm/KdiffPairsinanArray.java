package org.ks.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kevin on 2017/3/23.
 */
public class KdiffPairsinanArray {
    public static int findPairs(int[] nums, int k) {
        if (nums.length <= 1)
            return 0;

        if (k < 0)
            return 0;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    if (nums[i] < nums[j]) {
                        map.put(nums[i], nums[j]);
                    } else {
                        map.put(nums[j], nums[i]);
                    }
                }
            }
        }

        return map.size();
    }

    public static int _findPairs(int[] nums, int k) {
        if (nums.length <= 1)
            return 0;

        if (k < 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        int cnt = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (k == 0) {
                if (e.getValue() >= 2)
                    cnt++;
            } else {
                if (map.containsKey(e.getKey() + k))
                    cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 5, 4};
        System.out.println(findPairs(arr, 0));
        System.out.println(_findPairs(arr, 0));
    }
}
