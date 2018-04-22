package org.ks.algorithm;

import java.util.Stack;

/***
 * Given an absolute path for a file (Unix-style), simplify it.
 *
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 **/

public class SimplifyPath {
    public static String simplifyPath(String path) {
        if (path == null)
            return path;
        if (path.length() == 0)
            return path;

        Stack<String> stack = new Stack<>();
        String[] directory = path.split("/");
        for (int i = 0; i < directory.length; i++) {
            if (directory[i].equals(".") || directory[i].equals(""))
                continue;
            if (directory[i].equals("..")) {
                if (stack.size() > 0)
                    stack.pop();
                else
                    continue;
            }
            else
                stack.push(directory[i]);
        }

        if (stack.size() == 0)
            return "/";

        StringBuilder simplifiedPath = new StringBuilder("");

        while (stack.size() > 0) {
            simplifiedPath.insert(0, "/" + stack.pop());
        }

        return simplifiedPath.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/.././."));
        return;
    }
}
