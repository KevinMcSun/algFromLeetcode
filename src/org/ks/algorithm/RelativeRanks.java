package org.ks.algorithm;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kevin on 2017/2/13.
 */
public class RelativeRanks {
    public static String[] findRelativeRanks(int[] nums) {
        String[] ranklist = new String[nums.length];

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], 0);

        int rank = map.size();
        for (Map.Entry m : map.entrySet()) {
            int i = 0;
            for (; i < nums.length; i++) {
                if ((int)m.getKey() != nums[i])
                    continue;
                else
                    break;
            }
            String rankStr = "";

            if (rank == 1) {
                rankStr = "Gold Medal";
                rank--;
            } else if (rank == 2) {
                rankStr = "Silver Medal";
                rank--;
            } else if (rank == 3) {
                rankStr = "Bronze Medal";
                rank--;
            }
            else {
                rankStr = String.valueOf(rank--);
            }

            ranklist[i] = rankStr;
        }

        return ranklist;
    }

    public static void main(String[] args) {
        int[] nums = {2,1};
        String[] ranklist = findRelativeRanks(nums);

        for (String s : ranklist)
            System.out.print(s + ", ");
        System.out.println();
    }
}
