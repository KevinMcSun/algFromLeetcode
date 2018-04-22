package org.ks.algorithm;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kevin on 2017/1/18.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;

        int result = nums.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                if (map.get(num) >= 2)
                    result--;
                else
                    map.put(num, 2);
            }
        }

        int k = 0;
        for (Map.Entry entry : map.entrySet()) {
            for (int i = 0; i < (int)entry.getValue(); i++) {
                nums[k++] = (int)entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }
}
