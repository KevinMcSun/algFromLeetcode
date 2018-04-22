package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/10.
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        if ((n & (n - 1)) == 0)
            return true;
        return false;
    }
}
