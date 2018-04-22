package org.ks.algorithm;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1)
            return false;

        int sum = 1;
        int s = (int)Math.sqrt(num);
        boolean bol = (num / s == 0) && (s == (num / s));

        for (int i = 2; i <= s; i++) {
            if (num % i == 0) {
                if (i == s && bol)
                    sum = sum + i;
                else
                    sum = sum + i + num / i;
            }
        }

        if (sum == num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (checkPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }
}

