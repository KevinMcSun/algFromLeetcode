package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/15.
 */
public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else if (root.left != null && root.right == null)
            return minDepth(root.left) + 1;
        else if (root.left == null && root.right != null)
            return minDepth(root.right) + 1;
        else
            return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(1);

        node1.left = node2;
        node1.right =node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node4.left = node7;
        node4.right = node8;
        node6.right = node9;


        System.out.println(minDepth(node1));
    }
}
