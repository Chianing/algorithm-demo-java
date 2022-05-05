package com.chianing.tree;

import com.chianing.common.model.TreeNode;

import java.util.*;

/**
 * 路径总和
 * <a href="https://leetcode-cn.com/problems/path-sum-ii/">https://leetcode-cn.com/problems/path-sum-ii/</a>
 */
public class Q113_pathSum {

    private Deque<Integer> deque;
    private List<List<Integer>> resultList;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return Collections.emptyList();
        }

        deque = new ArrayDeque<>();
        resultList = new ArrayList<>();
        dfs(root, targetSum);

        return resultList;
    }

    private void dfs(TreeNode node, int sum) {
        if (node == null) {
            return;
        }

        deque.addLast(node.val);
        if (node.left == null && node.right == null && node.val == sum) {
            resultList.add(new ArrayList<>(deque));
        }

        int newSum = sum - node.val;
        dfs(node.left, newSum);
        dfs(node.right, newSum);
        deque.removeLast();

    }

}
