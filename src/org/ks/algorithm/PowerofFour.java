package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/10.
 */
public class PowerofFour {
    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;

        if ((num & (num - 1)) != 0)
            return false;

        if ((num & 0x55555555) == 0)
            return false;
        return true;
    }
}
