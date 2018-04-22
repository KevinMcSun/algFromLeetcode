package org.ks.algorithm;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2017/1/18.
 */
public class SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (!map.containsKey(n))
                map.put(n, 1);
            else
                map.put(n, 2);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer)entry.getValue() <= 1)
                list.add((Integer)entry.getKey());
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;
    }
}
