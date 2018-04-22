package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/23.
 */
public class FirstBadVersion {
    public static boolean isBadVersion(int version) {
        if (version >= 1702766719)
            return true;
        return false;
    }

    public static int firstBadVersion(int n) {
        return findBadVersionRecur(1, n);
    }

    public static int findBadVersionRecur(int low, int high) {
        if (low == high)
            return low;

        int mid = low + (high - low) / 2;
        if (isBadVersion(mid))
            return findBadVersionRecur(low, mid);
        else
            return findBadVersionRecur(mid + 1, high);
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }
}
