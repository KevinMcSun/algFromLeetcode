package org.ks.algorithm;

import java.util.*;

/**
 * Created by Kevin on 2017/1/20.
 */
public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(nums[i]);
        }

        return result;
    }
}
