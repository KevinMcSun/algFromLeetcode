package org.ks.algorithm;

/**
 * Created by Kevin on 2017/4/12.
 */
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        if (s == null)
            return s;
        s = process(s);
        if (s.length() <= 1)
            return s;

        s = ReverseStringII.reverseSubStr(s, 0, s.length() - 1);

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                s = ReverseStringII.reverseSubStr(s, j, i - 1);
                if (i < s.length() - 1)
                    j = i + 1;
            } else if (i == s.length() - 1) {
                s = ReverseStringII.reverseSubStr(s, j, i);
            }else {
                continue;
            }
        }

        return s;
    }

    public static String process(String s) {
        if (s == null)
            return s;
        s = s.trim();

        if (s.length() <= 1)
            return s;

        StringBuilder sb = new StringBuilder("");

        char prev_c = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else {
                if (prev_c == s.charAt(i))
                    continue;
                else
                    sb.append(s.charAt(i));
            }
            prev_c = s.charAt(i);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(process("   a   b "));
        System.out.println(reverseWords("   "));
    }
}
