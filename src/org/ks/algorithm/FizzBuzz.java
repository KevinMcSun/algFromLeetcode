package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2016/11/28.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                result.add(String.valueOf(i));
            }else if (i % 3 == 0 && i % 5 != 0) {
                result.add("Fizz");
            }else if (i % 3 != 0 && i % 5 == 0) {
                result.add("Buzz");
            }else {
                result.add("FizzBuzz");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(500));
    }
}
