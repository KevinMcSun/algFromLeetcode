package org.ks.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kevin on 2017/2/27.
 */
public class FindLargestValueinEachTreeRow {
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null)
            return res;

        res.add(root.val);

        LinkedList<TreeNode> levelNodes = new LinkedList<>();

        if (root.left == null && root.right == null) {
            return res;
        }

        levelNodes.add(root);

        while (!levelNodes.isEmpty()) {
            LinkedList<TreeNode> tempLevel = new LinkedList<>();
            for (TreeNode node : levelNodes) {
                if (node.left != null)
                    tempLevel.add(node.left);
                if (node.right != null)
                    tempLevel.add(node.right);
            }

            if (!tempLevel.isEmpty()) {
                int max = (int) (tempLevel.get(0).val);
                for (TreeNode node : tempLevel) {
                    if (node.val > max)
                        max = node.val;
                }
                res.add(max);
                levelNodes.clear();
                levelNodes.addAll(tempLevel);
            } else {
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.println(largestValues(root));
    }

}
