package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/11.
 */
public class SymmetricTree {
    public TreeNode invertTree(TreeNode root) {

        TreeNode _root = root;

        if (_root == null)
            return null;

        if (_root.left == null && _root.right == null)
            return _root;

        TreeNode p;
        p = _root.left;
        _root.left = _root.right;
        _root.right = p;

        invertTree(_root.left);
        invertTree(_root.right);

        return _root;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null && q != null)
            return false;
        else if (p != null && q == null)
            return false;
        else {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
            else
                return false;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode invertTree = this.invertTree(root);
        if (isSameTree(root, invertTree))
            return true;
        return false;

    }

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.right = node5;

        System.out.println(symmetricTree.isSymmetric(node1));
    }
}
