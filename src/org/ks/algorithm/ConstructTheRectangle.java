package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/13.
 */
public class ConstructTheRectangle {
    public static int[] constructRectangle(int area) {
        int sqr = (int)Math.sqrt(area);

        for (int i = sqr; i <= area; i--) {
            if (area % i == 0) {
                return new int[] {area / i, i};
            }else {
                continue;
            }
        }

        return new int[] {area, 1};
    }
}
