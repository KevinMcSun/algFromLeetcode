package org.ks.algorithm;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length, k, l;
        for (k = n - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) {
                break;
            }
        }
        if (k < 0) {
            reverse(nums, 0, nums.length -1);
        } else {
            for (l = n - 1; l > k; l--) {
                if (nums[l] > nums[k]) {
                    break;
                }
            }
            swap(nums, k, l);
            reverse(nums,  k + 1, nums.length - 1);
        }
    }

    public static int[] swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        return nums;
    }

    public static int[] reverse(int[] nums, int l, int r) {
        while (l < r) {
           swap(nums, l, r);
           l++;
           r--;
        }
        return nums;
    }
}
