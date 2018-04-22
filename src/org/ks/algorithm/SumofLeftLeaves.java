package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/8.
 */
public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null)
            return 0;
        if (isLeave(root.left))
            sum += root.left.val;
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }

    public  boolean isLeave(TreeNode node) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
        return false;
    }
}
