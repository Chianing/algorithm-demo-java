package com.chianing.tree;

import com.chianing.common.model.TreeNode;

import java.util.*;

/**
 * 二叉树锯齿形遍历
 * <a href="https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/">...</a>
 */
public class Q103_zigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(Collections.emptyList());
        }

        Queue<TreeNode> tmpQue = new ArrayDeque<>() {{
            addLast(root);
        }};
        List<List<Integer>> resultList = new ArrayList<>();
        boolean leftFlag = true;

        while (!tmpQue.isEmpty()) {
            Deque<Integer> subResult = new ArrayDeque<>();
            int queSize = tmpQue.size();

            for (int i = 0; i < queSize; i++) {
                TreeNode node = tmpQue.poll();

                // 添加结果列表 如果顺序为从左到右 则向双端队列的尾部插入数据 否则向双端队列的尾部插入数据
                assert node != null;
                if (leftFlag) {
                    subResult.offerLast(node.val);
                } else {
                    subResult.offerFirst(node.val);
                }

                if (node.left != null) {
                    tmpQue.offer(node.left);
                }
                if (node.right != null) {
                    tmpQue.offer(node.right);
                }

            }

            resultList.add(new LinkedList<>(subResult));
            leftFlag = !leftFlag;
        }

        return resultList;

    }

}
