package com.chianing.tree;

import com.chianing.common.model.TreeNode;

/**
 * 最小深度
 * <a href="https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/">https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/</a>
 */
public class Q111_MinDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (root.left == null || root.right == null) {
            return leftDepth + rightDepth + 1;
        }

        return Math.min(leftDepth, rightDepth) + 1;
    }

}
