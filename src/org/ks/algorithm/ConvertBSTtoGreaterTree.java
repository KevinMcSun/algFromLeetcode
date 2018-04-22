package org.ks.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Kevin on 2017/5/11.
 */
public class ConvertBSTtoGreaterTree {
    public static TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null)
            return root;

        ArrayList<Integer> list = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }

        stack.clear();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            int t = node.val;
            for (Integer n : list){
                if (t < n)
                    node.val += n;
            }
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
        return root;
    }

    public static TreeNode _convertBST(TreeNode root) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null)
            return root;
        TreeNode tNode = _convertBST(root.left);
        root.val = tNode == null ? 0 : tNode.val;

        TreeNode tSubNode = _convertBST(root.left.right);
        root.left.val = root.val + (tSubNode == null ? 0 : tSubNode.val);

        return root;
    }

    public static void main(String[] args) {
        //[5,2,13,1,3,11,14]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);

        TreeNode nr = _convertBST(root);

        return;
    }
}
