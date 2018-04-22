package org.ks.algorithm;

import java.util.LinkedList;

/**
 * Created by Kevin on 2017/2/27.
 */
public class FindBottomLeftTreeValue {
    public static int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return -1;

        LinkedList<TreeNode> levelNodes = new LinkedList<>();

        if (root.left == null && root.right == null)
            return root.val;

        levelNodes.add(root);

        while (!levelNodes.isEmpty()) {
            LinkedList<TreeNode> tempLevel = new LinkedList<>();
            for (TreeNode node: levelNodes) {
                if (node.left != null)
                    tempLevel.add(node.left);
                if (node.right != null)
                    tempLevel.add(node.right);
            }

            if (tempLevel.isEmpty())
                return  levelNodes.get(0).val;
            else {
                levelNodes.clear();
                levelNodes.addAll(tempLevel);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(6);
        node.right.left.left = new TreeNode(7);
        System.out.println(findBottomLeftValue(node));
    }
}
