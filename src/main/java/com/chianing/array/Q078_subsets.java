package com.chianing.array;

import java.util.*;

/**
 * 子集
 * <a href="https://leetcode-cn.com/problems/subsets/">https://leetcode-cn.com/problems/subsets/</a>
 */
public class Q078_subsets {

    private Deque<Integer> deque;
    private List<List<Integer>> resultList;

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }

        deque = new ArrayDeque<>();
        resultList = new ArrayList<>();

        backtrace(nums, 0);

        return resultList;
    }

    private void backtrace(int[] nums, int index) {
        if (index == nums.length) {
            resultList.add(new ArrayList<>(deque));
            return;
        }

        // 不选择第index个元素
        backtrace(nums, index + 1);

        // 选择第index个元素
        deque.addLast(nums[index]);
        backtrace(nums, index + 1);

        deque.removeLast();

    }

}
