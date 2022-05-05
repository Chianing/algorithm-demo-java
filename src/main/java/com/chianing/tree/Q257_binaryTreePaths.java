package com.chianing.tree;

import com.chianing.common.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 二叉树的所有路径
 * <a href="https://leetcode-cn.com/problems/binary-tree-paths/">https://leetcode-cn.com/problems/binary-tree-paths/</a>
 */
public class Q257_binaryTreePaths {

    private final List<String> resultList = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        dfs(root, "");

        return resultList;
    }

    private void dfs(TreeNode node, String path) {
        if (node == null) {
            return;
        }

        StringBuffer tmpSb = new StringBuffer(path);
        tmpSb.append(node.val);
        if (node.left == null && node.right == null) {
            resultList.add(tmpSb.toString());
            return;
        }

        tmpSb.append("->");
        dfs(node.left, tmpSb.toString());
        dfs(node.right, tmpSb.toString());

    }

}
