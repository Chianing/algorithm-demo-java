package com.chianing.offer2;

import com.chianing.common.model.TreeNode;

/**
 * 节点之和最大路径
 * <a href="https://leetcode.cn/problems/jC7MId/">...</a>
 */
public class Q051_maxPathSum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        getMaxSum(root);

        return maxSum;

    }

    private int getMaxSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftMaxSum = getMaxSum(node.left);
        int rightMaxSum = getMaxSum(node.right);

        int sum = node.val + Math.max(0, leftMaxSum) + Math.max(0, rightMaxSum);
        maxSum = Math.max(maxSum, sum);

        return node.val + Math.max(0, Math.max(leftMaxSum, rightMaxSum));
    }

}
