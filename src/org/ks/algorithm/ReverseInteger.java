package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 10/4/2016.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int INT_MAX = 2147483647;
        int INT_MIN = (-INT_MAX - 1);

        if (x == 0)
            return x;
        boolean postive = (x > 0) ? true : false;
        x = Math.abs(x);
        List list = new ArrayList();
        while (x > 0) {
            list.add(x % 10);
            x = x / 10;
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = result * 10 + (int) list.get(i);
            if (result > INT_MAX || result < INT_MIN)
                return 0;
        }
        if (postive)
            return result;
        else
            return -result;

    }

    public static void main(String[] args) {
        System.out.println(reverse(247483647));
    }
}
