package org.ks.algorithm;

import java.util.HashSet;

/**
 * Created by Kevin on 2016/11/29.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]))
                set.add(nums[i]);
            else
                set.remove(nums[i]);
        }
        int reslut = 0;
        for (Integer t: set) {
            reslut = t;
        }
        return reslut;
    }

    public int singleNumberII(int[] nums) {
        int reslut = 0;
        for (Integer t: nums) {
            reslut = t ^ reslut;
        }
        return reslut;
    }

    public static void main(String[] args) {

    }
}
