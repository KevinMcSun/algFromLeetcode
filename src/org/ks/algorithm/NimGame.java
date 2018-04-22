package org.ks.algorithm;

/**
 * Created by Kevin on 2016/11/28.
 */
public class NimGame {
    public boolean canWinNim(int n) {
        if (n == 0)
            return false;
        if (n <= 3)
            return true;
        if (n == 4)
            return false;

        return !(n % 4 == 0);
    }

    public static void main(String[] args) {
        NimGame nimGame = new NimGame();
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": "+ nimGame.canWinNim(i));
        }
    }
}
