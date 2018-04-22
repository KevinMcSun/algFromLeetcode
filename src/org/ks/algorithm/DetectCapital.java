package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/24.
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if (word.length() <= 1)
            return true;

        // The first letter is lowercase
        if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                    return false;
            }
            return true;
        } else { // The first letter is uppercase
            if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') { // The second letter is uppercase
                if (word.length() >= 3) {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                            return false;
                    }
                    return true;
                }
                return true;

            } else { // The second letter is lowercase
                if (word.length() >= 3) {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                            return false;
                    }
                    return true;
                }
                return true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("gooGle"));
    }
}
