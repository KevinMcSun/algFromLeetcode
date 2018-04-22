package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/13.
 */
public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];

        if (findNums.length == 0)
            return result;

        for (int i = 0; i < findNums.length; i++) {
            int j = 0;
            for (;j < nums.length; j++) {
                if (nums[j] != findNums[i])
                    continue;
                else
                    break;
            }
            j++;
            for (;j < nums.length; j++) {
                if (nums[j] > findNums[i]) {
                    result[i] = nums[j];
                    break;
                }
            }
            if (j == nums.length)
                result[i] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] result = nextGreaterElement(nums1, nums2);

        for (int n : result) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
