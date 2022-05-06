package com.chianing.other;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 最近的请求次数
 * <a href="https://leetcode-cn.com/problems/number-of-recent-calls/">https://leetcode-cn.com/problems/number-of-recent-calls/</a>
 */
public class Q933_RecentCounter {

    private Deque<Integer> deque;

    public Q933_RecentCounter() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        if (deque == null) {
            return -1;
        }

        deque.addLast(t);
        while (deque.peek() < t - 3000) {
            deque.poll();
        }

        return deque.size();
    }

}
