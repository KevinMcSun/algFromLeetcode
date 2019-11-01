package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
     static class Position {

        private int x;
        private int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0)
            return true;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    if (board[row][col] != c) {
                        continue;
                    } else {

                    }
                }
            }
        }
        return false;
    }

    public static List<Position> getStartPosition(char[][] board, char c) {
        List<Position> result = new ArrayList<>();

        if (board == null || board.length == 0)
            return result;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (c == board[i][j])
                    result.add(new Position(i, j));
                else
                    continue;
            }
        }

        return result;
    }
}
