package com.chianing.array;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q016_threeSumClosestTest {

    Q016_threeSumClosest solution = new Q016_threeSumClosest();

    @Test
    void threeSumClosest() {
        LogUtil.printAfterLog(solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}