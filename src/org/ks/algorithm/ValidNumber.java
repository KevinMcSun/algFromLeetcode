package org.ks.algorithm;

/**
 * Created by Kevin on 2017/3/11.
 */
public class ValidNumber {
    public static boolean isNumber(String s) {
        if (s == null)
            return false;

        s = s.trim();

        if (s.length() == 0)
            return false;

        if (s.length() == 1) {
            if (Character.isDigit(s.charAt(0)))
                return true;
            return false;
        }

        if (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == '.' || Character.isDigit(s.charAt(0))) {
            boolean hasCur = false;
            if (s.charAt(0) == '.') {
                hasCur = true;
                if (s.charAt(1) == 'e')
                    // ".e"
                    return false;
            }
            for (int i = 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)))
                    continue;
                else if (s.charAt(i) == '.') {
                    if ((s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-') && i == s.length() - 1)
                        // "-."
                        return false;

                    if (s.length() - 1 > i && s.charAt(i + 1) == 'e')
                        // "-.e12"
                        return false;

                    if (!hasCur) {
                        hasCur = true;
                        continue;
                    }
                    else
                        return false;
                } else if (Character.isLetter(s.charAt(i))) {
                    if (s.charAt(i) == 'e') {
                        if (s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-')
                            // "+e"
                            return false;

                        if (i == s.length() - 1)
                            return false;
                        else{
                            return isInteger(s.substring(i + 1));
                        }
                    }
                    else
                        // "35K"
                        return false;
                } else
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean isInteger(String num) {
        if (num.length() == 0)
            return false;

        if (num.length() == 1) {
            if (Character.isDigit(num.charAt(0)))
                return true;
            return false;
        }

        if (num.charAt(0) == '+' || num.charAt(0) == '-' || Character.isDigit(num.charAt(0))) {
           for (int i = 1; i < num.length(); i++) {
               if (Character.isDigit(num.charAt(i)))
                   continue;
               else
                   return false;
           }
            return true;
        } else
            return false;
    }

    public static boolean isNumberic(String s) {
        if (s == null)
            return false;
        if (s == "")
            return false;
        if (s.length() == 1) {
            if (Character.isDigit(s.charAt(0)))
                return true;
            return false;
        }

        int indexOfDot = s.indexOf('.');

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("-e58"));
    }
}

