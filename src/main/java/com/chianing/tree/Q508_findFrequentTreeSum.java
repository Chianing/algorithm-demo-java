package com.chianing.tree;

import com.chianing.common.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 出现次数最多的子树元素和
 * <a href="https://leetcode.cn/problems/most-frequent-subtree-sum/">...</a>
 */
public class Q508_findFrequentTreeSum {

    private int maxCnt = 0;
    private final Map<Integer, Integer> tmpMap = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        dfs(root);

        List<Integer> resultList = new ArrayList<>();
        for (Integer cnt : tmpMap.keySet()) {
            if (tmpMap.get(cnt) == maxCnt) {
                resultList.add(cnt);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int val = node.val + dfs(node.left) + dfs(node.right);
        tmpMap.put(val, tmpMap.getOrDefault(val, 0) + 1);
        maxCnt = Math.max(maxCnt, tmpMap.get(val));

        return val;

    }

}
