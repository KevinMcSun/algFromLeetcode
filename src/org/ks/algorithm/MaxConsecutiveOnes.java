package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/20.
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0 || nums.length == 1 && nums[0] == 0)
            return 0;
        if (nums.length == 1 && nums[0] == 1)
            return 1;

        int max = 0;
        int tmax = 0;
        boolean wasOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && wasOne) {
                tmax++;
            } else if (nums[i] == 1 && !wasOne) {
                wasOne = true;
                tmax = 1;
            } else {
                if (tmax > max)
                    max = tmax;
                tmax = 0;
                wasOne = false;
                continue;
            }
        }

        return tmax > max ? tmax : max;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
