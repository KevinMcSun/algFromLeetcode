package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2016/12/9.
 */
public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();

        if (num == 0) {
            res.add("0:00");
            return res;
        }

        if (num > 8)
            return res;

        String[] top0 = {"0"};
        String[] top1 = {"1", "2", "4", "8"};
        String[] top2 = {"3", "5", "6", "9", "10"};
        String[] top3 = {"7", "11"};

        String[] bottom0 = {"00"}; //1
        String[] bottom1 = {"01", "02", "04", "08", "16", "32"}; // 6
        String[] bottom2 = {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"}; // 15
        String[] bottom3 = {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"}; //20
        String[] bottom4 = {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"}; // 14
        String[] bottom5 = {"31", "47", "55", "59"}; // 4

        String[][] top = {top0, top1, top2, top3};
        String[][] bottom = {bottom0, bottom1, bottom2, bottom3, bottom4, bottom5};

        for (int k= 0; k <= num; k++) {
            if (k > 3 || num - k > 5)
                continue;
            for (int i = 0; i< top[k].length; i++) {
                for (int j = 0; j < bottom[num - k].length; j++) {
                    res.add(top[k][i] + ":" + bottom[num - k][j]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        BinaryWatch watch = new BinaryWatch();
        System.out.println(watch.readBinaryWatch(7));
    }
}