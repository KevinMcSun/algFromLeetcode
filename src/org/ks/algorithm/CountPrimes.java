package org.ks.algorithm;

import java.util.ArrayList;

/**
 * Created by Kevin on 2016/12/23.
 */
public class CountPrimes {
    public static int _countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static int countPrimes(int n) {
        ArrayList<Integer> primeNumberList = new ArrayList<>();

        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        if (n <= 5)
            return 3;
        if (n <= 7)
            return 4;

        primeNumberList.add(2);
        primeNumberList.add(3);
        primeNumberList.add(5);
        primeNumberList.add(7);

        int r = 4;
        for (int i = 8; i <= n; i++) {
            boolean isNotPrime = false;
            for (int j = 0; j < primeNumberList.size(); j++) {
                if (i % primeNumberList.get(j) == 0) {
                    isNotPrime = true;
                    break;
                }
            }

            if (isNotPrime)
                continue;

            if (isPrime(i)) {
                if (primeNumberList.size() < 100)
                    primeNumberList.add(i);
                r++;
            }
        }
        return r;
    }

    public static boolean isPrime(int n) {
        int sqrtN = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(_countPrimes(847483647));
    }
}
