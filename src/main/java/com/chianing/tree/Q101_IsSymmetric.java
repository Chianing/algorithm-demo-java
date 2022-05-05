package com.chianing.tree;

import com.chianing.common.model.TreeNode;

/**
 * 对称二叉树
 * <a href="https://leetcode-cn.com/problems/symmetric-tree/">https://leetcode-cn.com/problems/symmetric-tree/</a>
 */
public class Q101_IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return dfs(root.left, root.right);

    }

    private boolean dfs(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }

        if (leftNode == null || rightNode == null) {
            return false;
        }

        if (leftNode.val != rightNode.val) {
            return false;
        }

        return dfs(leftNode.left, rightNode.right) && dfs(leftNode.right, rightNode.left);

    }

}
