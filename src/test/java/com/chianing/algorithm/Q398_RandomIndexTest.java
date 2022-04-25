package com.chianing.algorithm;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q398_RandomIndexTest {

    @Test
    void pick() {
        Q398_RandomIndex solution = new Q398_RandomIndex(new int[]{1, 5, 3, 2, 3, 4, 3});
        for (int i = 0; i < 10; i++) {
            LogUtil.printAfterLog(solution.pick(3));
        }
    }
}