package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/10.
 */
public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        int maxPower = (int) Math.pow(3,(int)(Math.log(Integer.MAX_VALUE)/Math.log(3)));
        if (maxPower % n == 0)
            return true;
        return false;
    }
}
