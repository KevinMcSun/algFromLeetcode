/*
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines
 * are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
 * forms a container, such that the container contains the most water.
 */

package org.ks.algorithm;

/**
 * Created by Kevin on 10/9/2016.
 */
public class ContainerWithMostWater {
    public int maxArea1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = i + 1; j < height.length; j++){
                int tArea = (j - i) * Math.min(height[i], height[j]);
                if ( tArea > max){
                    max = tArea;
                }
            }
        }
        return max;
    }

    public int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high){
            int tArea = (high - low) * Math.min(height[low], height[high]);
            if (tArea > max)
                max = tArea;

            if (height[low] < height[high]){
                do{
                    low++;
                }while (low < high && height[low - 1] >= height[low]);
            }else{
                do{
                    high--;
                }while (low < high && height[high + 1] >= height[high]);
            }
        }
        return max;
    }
}
