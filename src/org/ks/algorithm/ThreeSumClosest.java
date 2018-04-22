/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

package org.ks.algorithm;

import java.util.*;

/**
 * Created by Kevin on 10/9/2016.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nList.add(nums[i]);
        }
        Collections.sort(nList);

        Integer min = Integer.MAX_VALUE;
        int result = 0;

        int len = nList.size();
        for (int i = 0; i < len - 2; i++) {
            Integer a = nList.get(i);
            int l = i + 1;
            int r = len - 1;

            while (l < r) {
                Integer b = nList.get(l);
                Integer c = nList.get(r);

                if (Math.abs(a + b + c - target) < min) {
                    result = a + b + c;
                    if (a + b + c - target < 0) {
                        while (l < r && nList.get(l).equals(nList.get(l + 1)))
                            l++;
                        l++;
                    } else if (a + b + c - target == 0) {
                        return target;
                    } else {
                        while (l < r && nList.get(r).equals(nList.get(r - 1)))
                            r--;
                        r--;
                    }
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 2, 1, -4};
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        System.out.println(threeSumClosest.threeSumClosest(nums, 1));
        return;
    }
}
