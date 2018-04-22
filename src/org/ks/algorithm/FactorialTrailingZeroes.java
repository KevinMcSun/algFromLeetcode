package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/16.
 */
public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int ret = 0;
        while(n != 0){
            ret += n / 5;
            n /= 5;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));
    }
}
