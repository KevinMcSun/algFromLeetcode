package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/8.
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num < 10)
            return num;
        int s = 0;
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        if (s < 10)
            return s;
        else
            return addDigits(s);
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(38));
    }
}
