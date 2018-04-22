package org.ks.algorithm;

public class DeleteOperationForTwoStrings {
    public static int minDistance(String word1, String word2) {
        if (word1.length() == 0)
            return word2.length();
        if (word2.length() == 0)
            return word1.length();
        int cnt = 0;



        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(minDistance("", ""));
    }
}
