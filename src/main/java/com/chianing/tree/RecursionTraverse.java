package com.chianing.tree;

import com.chianing.common.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 二叉树递归遍历
 */
public class RecursionTraverse {

    private List<Integer> resultList;

    /**
     * 前序遍历
     *
     * <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">https://leetcode-cn.com/problems/binary-tree-preorder-traversal/</a>
     */
    public List<Integer> prePrint(TreeNode node) {
        if (node == null) {
            return Collections.emptyList();
        }
        if ((node.left == null && node.right == null)) {
            return List.of(node.val);
        }

        resultList = new ArrayList<>();
        recursionPre(node);

        return resultList;

    }

    private void recursionPre(TreeNode node) {
        if (node == null) {
            return;
        }

        resultList.add(node.val);
        recursionPre(node.left);
        recursionPre(node.right);
    }

    /**
     * 中序遍历
     * <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">https://leetcode-cn.com/problems/binary-tree-inorder-traversal/</a>
     */
    public List<Integer> midPrint(TreeNode node) {
        if (node == null) {
            return Collections.emptyList();
        }
        if ((node.left == null && node.right == null)) {
            return List.of(node.val);
        }

        resultList = new ArrayList<>();
        recursionMid(node);

        return resultList;

    }

    private void recursionMid(TreeNode node) {
        if (node == null) {
            return;
        }

        recursionMid(node.left);
        resultList.add(node.val);
        recursionMid(node.right);
    }

    /**
     * 后序遍历
     * <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/">https://leetcode-cn.com/problems/binary-tree-postorder-traversal/</a>
     */
    public List<Integer> aftPrint(TreeNode node) {
        if (node == null) {
            return Collections.emptyList();
        }
        if ((node.left == null && node.right == null)) {
            return List.of(node.val);
        }

        resultList = new ArrayList<>();
        recursionAft(node);

        return resultList;

    }

    private void recursionAft(TreeNode node) {
        if (node == null) {
            return;
        }

        recursionAft(node.left);
        recursionAft(node.right);
        resultList.add(node.val);
    }

}
