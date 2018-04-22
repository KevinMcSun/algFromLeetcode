package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2016/12/17.
 */
public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> pathList = new ArrayList<>();
        StringBuilder builder = new StringBuilder("");

        getPathsRecur(root, pathList, builder);

        return  pathList;
    }

    public static void getPathsRecur(TreeNode node, List<String> pathList, StringBuilder builder) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            builder.append(String.valueOf(node.val));
            pathList.add(builder.toString());
        } else {
            builder.append(String.valueOf(node.val) + "->");
            getPathsRecur(node.left, pathList, builder);
            getPathsRecur(node.right, pathList, builder);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(5);

        System.out.println(binaryTreePaths(root));
    }
}
