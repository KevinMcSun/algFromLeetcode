package org.ks.algorithm;

/**
 * Created by Kevin on 2016/11/29.
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;
        else if (root.left != null && root.right == null)
            return maxDepth(root.left) + 1;
        else if (root.left == null && root.right != null)
            return maxDepth(root.right) + 1;
        else
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
