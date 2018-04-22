package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2017/2/23.
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        if (nums == null)
            return rs;

        if (nums.length == 0)
            return rs;

        if (nums.length == 1) {
            tempList.add(nums[0]);
            rs.add(tempList);
            return rs;
        }

        int pos = 0;
        while (pos < nums.length - 1) {
            int size = rs.size();
            for (int i = 0; i < size; i++) {
                for (int j = pos + 1; j < rs.size(); j++) {
                    tempList = rs.get(i);
                    int t = tempList.get(j);
                    tempList.set(j, tempList.get(pos));
                    tempList.set(pos, t);
                    rs.add(tempList);
                }
            }
            pos++;
        }

        return rs;
    }

    public static List<List<Integer>> _permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null)
            return res;

        if (nums.length == 0) {
            res.add(new ArrayList<>());
            return res;
        }

        ArrayList<Integer> list = new ArrayList<>();
        dfs(res, list, nums);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> list, int[] nums) {

        int n = nums.length;
        if (list.size() == n) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            dfs(res, list, nums);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(permute(num));
    }
}
