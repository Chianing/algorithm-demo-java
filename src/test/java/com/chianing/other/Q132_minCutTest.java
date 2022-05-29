package com.chianing.other;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q132_minCutTest {

    Q132_minCut solution = new Q132_minCut();

    @Test
    void minCut() {
        // LogUtil.printAfterLog(solution.minCut("AAB"));
        // LogUtil.printAfterLog(solution.minCut("A"));
        // LogUtil.printAfterLog(solution.minCut("AB"));
        LogUtil.printAfterLog(solution.minCut("ABB"));
    }
}