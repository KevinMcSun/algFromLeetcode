package org.ks.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {
    private static final HashSet<Character> firstRowInKeyboard = new HashSet<Character>() {
        {
            this.add('Q');
            this.add('q');
            this.add('W');
            this.add('w');
            this.add('E');
            this.add('e');
            this.add('R');
            this.add('r');
            this.add('T');
            this.add('t');
            this.add('Y');
            this.add('y');
            this.add('U');
            this.add('u');
            this.add('I');
            this.add('i');
            this.add('O');
            this.add('o');
            this.add('P');
            this.add('p');
        }
    };

    private static final HashSet<Character> secondRowInKeyboard = new HashSet<Character>() {
        {
            this.add('A');
            this.add('a');
            this.add('S');
            this.add('s');
            this.add('D');
            this.add('d');
            this.add('F');
            this.add('f');
            this.add('G');
            this.add('g');
            this.add('H');
            this.add('h');
            this.add('J');
            this.add('j');
            this.add('K');
            this.add('k');
            this.add('L');
            this.add('l');
        }
    };

    private static final HashSet<Character> thirdRowInKeyboard = new HashSet<Character>() {
        {
            this.add('Z');
            this.add('z');
            this.add('X');
            this.add('x');
            this.add('C');
            this.add('c');
            this.add('V');
            this.add('v');
            this.add('B');
            this.add('b');
            this.add('N');
            this.add('n');
            this.add('M');
            this.add('m');
        }
    };

    public static String[] findWords(String[] words) {
        if (words == null)
            return null;

        if (words.length == 0)
            return new String[]{};

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isInSameRow(words[i]))
                resultList.add(words[i]);
            else
                continue;
        }

        String[] resultArray = new String[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] =resultList.get(i);
        }

        return resultArray;
    }

    public static boolean isInSameRow(String word) {
        if (word == null || word.length() == 0)
            return true;

        char firstChar = word.charAt(0);
        HashSet<Character> set = null;
        if (firstRowInKeyboard.contains(firstChar))
            set = firstRowInKeyboard;
        else if (secondRowInKeyboard.contains(firstChar))
            set = secondRowInKeyboard;
        else if (thirdRowInKeyboard.contains(firstChar))
            set = thirdRowInKeyboard;
        else
            return false;

        for (int i = 0; i < word.length(); i++) {
            if (set.contains(word.charAt(i)))
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strArray = new String[] {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(strArray)));
    }
}
