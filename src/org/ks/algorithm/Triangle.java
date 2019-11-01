package org.ks.algorithm;

import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        List<Integer> minLen = triangle.get(len - 1);
        for (int layer = len - 2; layer >= 0; layer--) {
            for (int i = 0; i <= layer; i++) {
                minLen.set(i, Math.min(minLen.get(i), minLen.get(i + 1)) + triangle.get(layer).get(i));
            }
        }
        return minLen.get(0);
    }

    public static void main(String[] args) {

    }
}
