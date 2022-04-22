package com.chianing.algorithm;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q146_LRUCacheTest {

    private static final Q146_LRUCache solution;

    static {
        solution = new Q146_LRUCache(3);
        solution.put(1, 1);
        solution.put(2, 2);
        solution.put(4, 4);
    }

    @Test
    void get() {
        LogUtil.printBeforeLog(solution);
        LogUtil.printAfterLog(solution.get(1));
        LogUtil.printAfterLog(solution);
    }

    @Test
    void put() {
        LogUtil.printBeforeLog(solution);
        solution.put(3, 3);
        LogUtil.printAfterLog(solution);
    }
}