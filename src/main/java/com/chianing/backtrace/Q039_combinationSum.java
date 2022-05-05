package com.chianing.backtrace;

import java.util.*;

/**
 * 组合求和
 * <a href="https://leetcode-cn.com/problems/combination-sum/">https://leetcode-cn.com/problems/combination-sum/</a>
 */
public class Q039_combinationSum {

    private Deque<Integer> deque;
    private List<List<Integer>> resultList;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return Collections.emptyList();
        }

        deque = new ArrayDeque<>();
        resultList = new ArrayList<>();

        Arrays.sort(candidates);
        backtrace(candidates, target, 0);

        return resultList;
    }

    private void backtrace(int[] arr, int target, int beginIndex) {
        if (target == 0) {
            resultList.add(new ArrayList<>(deque));
            return;
        }

        for (int i = beginIndex; i < arr.length; i++) {
            int newTarget = target - arr[i];
            if (newTarget < 0) {
                return;
            }

            deque.addLast(arr[i]);
            backtrace(arr, newTarget, i);
            deque.removeLast();
        }

    }

}
