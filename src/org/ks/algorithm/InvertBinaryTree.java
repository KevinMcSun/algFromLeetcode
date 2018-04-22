package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/8.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null)
            return root;

        TreeNode p;
        p = root.left;
        root.left = root.right;
        root.right = p;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
