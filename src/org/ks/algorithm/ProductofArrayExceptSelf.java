package org.ks.algorithm;

/**
 * Created by Kevin on 2017/5/16.
 */

/**
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of
 * all the elements of nums except nums[i].
 *
 * Solve it without division and in O(n).
 *
 * For example, given [1,2,3,4], return [24,12,8,6].
 *
 * Follow up:
 *
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the
 * purpose of space complexity analysis.)
 */
public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length <= 1)
            return nums;

        int temp = 1;

        for (int i = 0; i < nums.length; i++) {
            temp *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[i] = temp / nums[i];
            else
                nums[i] = 0;
        }

        return nums;
    }

    public static int[] productExceptSelfII(int[] nums) {
        if (nums == null || nums.length <= 1)
            return nums;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                else
                    result[j] *= nums[i];
            }
        }

        return result;
    }

    public static int[] productExceptSelfIII(int[] nums) {
        if (nums == null || nums.length <= 1)
            return nums;

        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int temp = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] r1 = productExceptSelf(nums1);
        int[] nums2 = {1,2,3,4};
        int[] r2 = productExceptSelfII(nums2);
        int[] nums3 = {1,2,3,4};
        int[] r3 = productExceptSelfIII(nums3);

        return ;
    }
}
