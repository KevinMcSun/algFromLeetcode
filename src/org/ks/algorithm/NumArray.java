package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/20.
 */
public class NumArray {
    private int[] sums;
    public NumArray(int[] nums) {
        int sum = 0;
        this.sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return sums[j];

        return sums[j] - sums[i - 1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(2, 5));
    }
}
