package org.ks.algorithm;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kevin on 2016/12/11.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> reslutList = new ArrayList<List<Integer>>();

        if (root == null)
            return null;

        List<TreeNode> levelNodeList = new ArrayList<TreeNode>();
        LinkedList<List<TreeNode>> rs = new LinkedList<List<TreeNode>>();

        levelNodeList.add(root);

        rs.push(levelNodeList);

        List<TreeNode> popLevelNodeList = new ArrayList<>();

        while (!rs.isEmpty()) {
            popLevelNodeList = rs.pop();
            for (TreeNode tn : popLevelNodeList) {
                if (tn != null);
            }
        }


        return reslutList;
    }
}
