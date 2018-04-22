/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * */

package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 10/7/2016.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
        generate(list, n, 0, 0, "");
        return list;
    }

    public void generate(List<String> list, int n, int left, int right, String tStr){
        if (left < right)
            return;
        if (left + right == 2 * n){
            if (left == right){
                list.add(tStr);
            }
            return;
        }
        generate(list, n, left + 1, right, tStr + "(");
        generate(list, n, left, right + 1, tStr + ")");
    }
}
