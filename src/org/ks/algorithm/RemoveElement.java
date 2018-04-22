/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * */

package org.ks.algorithm;

/**
 * Created by Kevin on 10/7/2016.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1){
            if (nums[0] == val) {
                nums[0] = 0;
                return 0;
            }
            else
                return 1;
        }
        int cnt = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++){
            if (nums[i] == val) {
                cnt++;
                for (int j = i; j < nums.length - 1; j++){
                    nums[j] = nums[j + 1];
                }
                i--;
                nums[nums.length - cnt] = 0;
                len--;
            }
        }
        return nums.length - cnt;
    }

    public int removeElementByExchange(int[] nums, int val) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1){
            if (nums[0] == val) {
                nums[0] = 0;
                return 0;
            }
            else
                return 1;
        }
        int cnt = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++){
            if (nums[i] == val) {
                cnt++;
                int tmp = nums[i];
                nums[i] = nums[nums.length - cnt];
                nums[nums.length - cnt] = 0;
                i--;
                len--;
            }
        }
        return nums.length - cnt;
    }
}
