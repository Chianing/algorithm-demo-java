package com.chianing.tree;

import com.chianing.common.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树遍历
 */
public class Traverse {

    /**
     * 前序遍历
     * <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">https://leetcode-cn.com/problems/binary-tree-preorder-traversal/</a>
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> tmpStack = new Stack<>();

        tmpStack.push(root);
        while (!tmpStack.isEmpty()) {
            TreeNode node = tmpStack.pop();
            resultList.add(node.val);
            if (node.right != null) {
                tmpStack.push(node.right);
            }
            if (node.left != null) {
                tmpStack.push(node.left);
            }
        }

        return resultList;
    }


    /**
     * 中序遍历
     * <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/">https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/</a>
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> tmpStack = new Stack<>();

        while (root != null || !tmpStack.isEmpty()) {
            while (root != null) {
                tmpStack.push(root);
                root = root.left;
            }
            TreeNode node = tmpStack.pop();
            resultList.add(node.val);
            if (node.right != null) {
                root = node.right;
            }
        }

        return resultList;

    }


    /**
     * 后序遍历
     * <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/submissions/">https://leetcode-cn.com/problems/binary-tree-postorder-traversal/submissions/</a>
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> tmpStack = new Stack<>();
        TreeNode cur = root;

        tmpStack.push(root);
        while (!tmpStack.isEmpty()) {
            TreeNode node = tmpStack.peek();
            if (node.left != null && node.left != cur && node.right != cur) {
                tmpStack.push(node.left);
            } else if (node.right != null && node.right != cur) {
                tmpStack.push(node.right);
            } else {
                resultList.add(tmpStack.pop().val);
                cur = node;
            }
        }

        return resultList;

    }

}
