package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/25.
 */
/**
 * The guess API is defined in the parent class GuessGame.
 * @param num, your guess
 * @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
 * int guess(int num);
 */
public class GuessNumberHigherOrLower {
    public static int guess(int num) {
        if (num > 6)
            return 1;
        else if (num == 6)
            return 0;
        else
            return -1;
    }

    public static int guessNumber(int n) {
        return guessNumberRecur(1, n);
    }

    public static int guessNumberRecur(int low, int high) {
        System.out.println(low + " " + high);
        if (low == high)
            return low;
        int mid = low + (high - low) / 2;
        if (guess(mid) == 0)
            return mid;
        else if (guess(mid) == -1)
            return guessNumberRecur(low, mid);
        else
            return guessNumberRecur(mid + 1, high);
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(100));
    }
}
