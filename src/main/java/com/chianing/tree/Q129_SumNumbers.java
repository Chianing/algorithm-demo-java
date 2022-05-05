package com.chianing.tree;

import com.chianing.common.model.TreeNode;

/**
 * 求跟节点到叶节点数字之和
 * <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/</a>
 */
public class Q129_SumNumbers {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return dfs(root, 0);

    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        int tmp = sum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return tmp;
        }

        return dfs(node.left, tmp) + dfs(node.right, tmp);

    }

}
