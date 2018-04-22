package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/18.
 */
public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                continue;
            if (nums[i] > nums[i + 1])
                return nums[i + 1];
        }

        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findMin(nums));
        for (int i = 0; i < 100000; i ++)
            System.out.print(i + ", ");
    }
}
