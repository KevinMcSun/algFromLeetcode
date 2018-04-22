/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */

package org.ks.algorithm;

/**
 * Created by Kevin on 10/5/2016.
 */
public class PalindromeNumber {
    public int countDigits(int x){
        if (x == 0)
            return 1;
        int d = 0;
        while (x != 0){
            x /= 10;
            d++;
        }
        return d;
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return  false;
        if (x == 0)
            return true;

        int digits = this.countDigits(x);

        if (digits == 1)
            return true;

        int left = 1;
        int right = 10;
        for (int i = 0; i < digits - 1; i++){
            left *= 10;
        }

        while (left >= right && x != 0){
            int high = x / left;
            int low = x % right;
            if (high != low)
                return false;
            x = x % left;
            x = x / right;
            left /= 100;
        }

        return true;
    }
}
