package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/27.
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        if (prices.length == 1)
            return 0;

        int[] np = new int[prices.length - 1];

        for (int i = 0; i < prices.length - 1; i++) {
            np[i] = prices[i + 1] - prices[i];
        }

        int maxProfit = _maxSubArraySum(np);


        return maxProfit > 0 ? maxProfit : 0;
    }

    public static int _maxSubArraySum(int a[]) {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < a.length; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    public static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = 0, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}
