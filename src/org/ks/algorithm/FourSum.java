package org.ks.algorithm;

import java.util.*;

/**
 * Created by Kevin on 10/8/2016.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> integerList = new ArrayList<>();

        for (int num : nums) {
            integerList.add(num);
        }

        Collections.sort(integerList);

        int len = integerList.size();
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && integerList.get(i).equals(integerList.get(i - 1)))
                continue;
            Integer a = integerList.get(i);
            Integer rest = (Integer) target - a;

            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && integerList.get(j - 1).equals(integerList.get(j)))
                    continue;
                Integer b = integerList.get(j);

                int low = j + 1;
                int high = len - 1;

                while (low < high) {
                    Integer c = integerList.get(low);
                    Integer d = integerList.get(high);
                    if (rest - (b + c + d) == 0) {
                        List<Integer> tl = new ArrayList<>();
                        tl.add(a);
                        tl.add(b);
                        tl.add(c);
                        tl.add(d);
                        result.add(tl);
                        while (low < len - 1 && integerList.get(low).equals(integerList.get(low + 1)))
                            low++;
                        while (high > j + 1 && integerList.get(high).equals(integerList.get(high - 1)))
                            high--;
                        low++;
                        high--;
                    } else if (rest - (b + c + d) > 0) {
                        while (low < len - 1 && integerList.get(low).equals(integerList.get(low + 1)))
                            low++;
                        low++;
                    } else {
                        while (high > j + 1 && integerList.get(high).equals(integerList.get(high - 1)))
                            high--;
                        high--;
                    }
                }

            }

        }
        return result;
    }
}
