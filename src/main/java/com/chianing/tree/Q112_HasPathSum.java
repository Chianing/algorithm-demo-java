package com.chianing.tree;

import com.chianing.common.model.TreeNode;

/**
 * 路径总和
 * <a href="https://leetcode-cn.com/problems/path-sum/">https://leetcode-cn.com/problems/path-sum/</a>
 */
public class Q112_HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return dfsPath(root, targetSum);

    }

    private boolean dfsPath(TreeNode node, int sum) {
        if (node == null) {
            return false;
        }

        sum -= node.val;
        if (node.left == null && node.right == null && sum == 0) {
            return true;
        }

        return dfsPath(node.left, sum) || dfsPath(node.right, sum);

    }

}
