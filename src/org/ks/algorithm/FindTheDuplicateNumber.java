package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/19.
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ (i) ^ nums[i];
        }
        return result;
    }
}
