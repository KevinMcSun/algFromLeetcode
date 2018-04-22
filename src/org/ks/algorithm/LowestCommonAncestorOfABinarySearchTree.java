package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/16.
 */

import java.util.LinkedList;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as
 * the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 *
 *         _______6______
 *        /              \
 *    ___2__          ___8__
 *   /      \        /      \
 *  0      _4       7       9
 * /  \
 *3   5
 *
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2,
 * since a node can be a descendant of itself according to the LCA definition.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public static LinkedList<TreeNode> pathToTreeNode(TreeNode root, TreeNode p, LinkedList<TreeNode> path) {
        if (path.size() > 0 && path.getLast() == p)
            return path;

        if (root == null)
            return path;
        path.add(root);

        while (path.size() > 0) {
            if (path.getLast() == p)
                return path;
            else {
                if (root.left == null && root.right == null) {
                    path.removeLast();
                    break;
                } else if (root.left != null && root.right == null){
                    pathToTreeNode(root.left, p, path);
                } else if (root.left == null && root.right != null){
                    pathToTreeNode(root.right, p, path);
                } else {
                    pathToTreeNode(root.left, p, path);
                    pathToTreeNode(root.right, p, path);
                }
            }
        }
        return path;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        return null;
    }

    public static void main(String[] args){
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(9);
        TreeNode node8 = new TreeNode(3);
        TreeNode node9 = new TreeNode(5);

        node1.left = node2;
        node1.right =node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node4.right = node9;

        LinkedList<TreeNode> path = new LinkedList<TreeNode>();

        pathToTreeNode(node1, node5, path);

        return;
    }
}
