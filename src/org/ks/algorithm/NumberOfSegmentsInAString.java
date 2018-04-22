package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/9.
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;
        if (s.length() == 1) {
            if (s == " ")
                return 0;
            return 1;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }

        return s.split(" ").length;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInAString numberOfSegmentsInAString = new NumberOfSegmentsInAString();
        System.out.println(numberOfSegmentsInAString.countSegments("   Hello,    my   d name is John "));
    }
}
