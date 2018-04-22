package org.ks.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Kevin on 2016/12/14.
 */
public class ContainsDuplicate {
    public boolean _containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                return true;
            else
                list.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicateII(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums)
            set.add(n);

        if (set.size() == nums.length)
            return false;
        else
            return true;
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : nums)
            map.put(n, 0);

        if (map.size() == nums.length)
            return false;
        else
            return true;



    }



    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    }
}
