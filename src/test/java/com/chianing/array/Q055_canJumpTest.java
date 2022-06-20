package com.chianing.array;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q055_canJumpTest {

    Q055_canJump solution = new Q055_canJump();

    @Test
    void canJump() {
        LogUtil.printAfterLog(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        LogUtil.printAfterLog(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}