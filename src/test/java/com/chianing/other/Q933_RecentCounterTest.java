package com.chianing.other;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q933_RecentCounterTest {

    @Test
    void ping() {
        Q933_RecentCounter solution = new Q933_RecentCounter();
        LogUtil.printAfterLog(solution.ping(1));
        LogUtil.printAfterLog(solution.ping(100));
        LogUtil.printAfterLog(solution.ping(3001));
        LogUtil.printAfterLog(solution.ping(3002));
    }
}