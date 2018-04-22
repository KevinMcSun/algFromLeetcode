package org.ks.algorithm;

import java.util.Collections;

/**
 * Created by Kevin on 2016/12/22.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0)
            return;

        k %= nums.length;

        int[] t = new int[k];

        for (int i = 0; i < k; i++)
            t[i] = nums[nums.length - k + i];

        for (int i = 0; i <= nums.length - 1 - k; i++) {
            nums[nums.length - 1 - i] = nums[nums.length - 1 - i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = t[i];
        }
    }

    public static void printArray(int[] nums){
        for(int n : nums)
            System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        rotate(nums, 355);
        printArray(nums);
    }
}
