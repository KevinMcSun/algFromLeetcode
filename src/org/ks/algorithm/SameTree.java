package org.ks.algorithm;

/**
 * Created by Kevin on 2016/11/29.
 */
public class SameTree {
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
}
