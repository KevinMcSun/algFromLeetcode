package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/19.
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int i = 0; i < 32; i++)
            count[i] = 0;

        int result = 0;

        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j] >> i) & 1) != 0) {
                    count[i]++;
                }
            }
            result |= ((count[i] % 3) << i);
        }

        return result;
    }
}
