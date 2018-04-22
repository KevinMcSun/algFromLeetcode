package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public static List<Integer> diffWaysToCompute(String input) {
        if (input == null)
            return null;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                List<Integer> res1 = diffWaysToCompute(input.substring(0, i));
                List<Integer> res2 = diffWaysToCompute(input.substring(i + 1));
                for (int index1 = 0; index1 < res1.size(); index1++) {
                    for (int index2 = 0; index2 < res2.size(); index2++) {
                        if (input.charAt(i) == '+') {
                            res.add(res1.get(index1) + res2.get(index2));
                        } else if (input.charAt(i) == '-') {
                            res.add(res1.get(index1) - res2.get(index2));
                        } else {
                            res.add(res1.get(index1) * res2.get(index2));
                        }
                    }
                }
            }
        }

        if (res == null || res.size() == 0)
            res.add(Integer.valueOf(input));
        return res;
    }

    public static void main(String[] args) {
        String input = "2*3-4*5";
        System.out.println(diffWaysToCompute(input));
    }
}
