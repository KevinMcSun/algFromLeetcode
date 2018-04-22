package org.ks.algorithm;

import java.util.*;

/**
 * Created by Kevin on 2017/2/27.
 */
public class QueueReconstructionbyHeight {
    public static int[][] reconstructQueue(int[][] people) {
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < people.length; i++)
            list.add(new Integer[]{people[i][0], people[i][1]});

        Collections.sort(list, new Comparator<Integer[]>() {
            public int compare(Integer[] arr1, Integer[] arr2) {
                if (arr1[0] < arr2[0])
                    return 1;
                else if (arr1[0] == arr2[0])
                    return 0;
                else
                    return -1;
            }
        });

        int[][] arr = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = new int[]{list.get(i)[0], list.get(i)[1]};
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i][0] + "," + arr[i][1] + "]");
        }
        return;
    }
}
