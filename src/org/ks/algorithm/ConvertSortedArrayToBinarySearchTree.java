package org.ks.algorithm;

/**
 * Created by Kevin on 2017/2/13.
 */
public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        TreeNode root = null;
        root = buildBST(nums, 0, nums.length - 1, root);
        return root;
    }

    public static TreeNode buildBST(int[] nums, int low, int high, TreeNode root) {
        if (low > high)
            return null;

        if (low == high)
            root = new TreeNode(nums[low]);

        int mid = low + (high - low) / 2;

        root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, low, mid - 1, root.left);
        root.right = buildBST(nums, mid + 1, high, root.right);

        return root;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = sortedArrayToBST(nums);
        return;
    }
}
