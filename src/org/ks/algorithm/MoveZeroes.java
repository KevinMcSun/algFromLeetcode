package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/8.
 */


public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2)
            return;

        int p = 0;
        int q = 0;

        while (p < nums.length && nums[p] != 0) p++;
        q = p;
        while (q < nums.length && nums[q] == 0) q++;
        while (q < nums.length) {
            nums[p] = nums[q];
            nums[q] = 0;
            while (p < nums.length && nums[p] != 0) p++;
            while (q < nums.length && nums[q] == 0) q++;
        }
    }

    public static void main(String[] args) {
        MoveZeroes zeroes = new MoveZeroes();
        int[] nums = {0,0};
        zeroes.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
