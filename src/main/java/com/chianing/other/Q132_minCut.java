package com.chianing.other;

/**
 * 分隔字符串
 * <a href="https://leetcode.cn/problems/palindrome-partitioning-ii/">...</a>
 */
public class Q132_minCut {

    public int minCut(String s) {
        if (s == null || s.length() == 1) {
            return 0;
        }

        int length = s.length();
        char[] strArr = s.toCharArray();

        // 先找出s对应的回文子串结果列表
        // reverseResult[left][right]代表字符串s从left到right是否为回文的
        boolean[][] reverseResult = new boolean[length + 1][length + 1];
        for (int right = 1; right <= length; right++) {
            for (int left = right; left >= 1; left--) {
                if (right == left) {
                    // 区间内只有一个元素
                    reverseResult[left][right] = true;
                    continue;
                }
                if (strArr[right - 1] != strArr[left - 1]) {
                    continue;
                }
                // left和right对应的字符相等前提下
                // left和right中间只差一个元素 或不考虑left和right两个元素时 中间的字符串时回文的
                // 则认为left到right区间是回文的
                if ((right - left == 1) || reverseResult[left+1][right - 1]) {
                    reverseResult[left][right] = true;
                }
            }
        }

        int[] result = new int[length + 1];
        for (int right = 1; right <= length; right++) {
            if (reverseResult[1][right]) {
                // 如果从头到i都是回文的 就不需要分隔
                result[right] = 0;
                continue;
            }

            result[right] = right - 1;
            for (int left = 1; left <= right; left++) {
                // 默认的最大值 假设所有的字符串都不是回文的 即所有字符串都要分隔
                if (reverseResult[left][right]) {
                    // 如果i到j区间是回文的 则尝试修改最小分隔次数
                    result[right] = Math.min(result[right], result[left - 1] + 1);
                }
            }
        }

        return result[length];

    }

}
