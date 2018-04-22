/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

package org.ks.algorithm;

import java.util.Stack;

/**
 * Created by Kevin on 10/6/2016.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null)
            return false;
        if (s.equals(""))
            return true;
        if (s.length() % 2 == 1)
            return false;

        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '}') {
                if (stack.size() == 0)
                    return false;
                if ((char) stack.peek() == '{') {
                    stack.pop();
                }else{
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (stack.size() == 0)
                    return false;
                if ((char) stack.peek() == '[') {
                    stack.pop();
                }else{
                    return false;
                }
            }
            if (s.charAt(i) == ')') {
                if (stack.size() == 0)
                    return false;
                if ((char) stack.peek() == '(') {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        if (stack.size() == 0)
            return true;
        return false;
    }
}
