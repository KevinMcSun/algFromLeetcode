package org.ks.algorithm;

/**
 * Created by Kevin on 10/7/2016.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        int len = nums.length;
        int cnt = 0;
        for (int i = 0; i < len - 1; i++){
            if (nums[i] == nums[i + 1]){
                cnt++;
                for (int j = i; j < len - 1; j++){
                    nums[j] = nums[j + 1];
                }
                i--;
                len--;
                //nums[len] = 0;
            }
        }
        return len;
    }
}
