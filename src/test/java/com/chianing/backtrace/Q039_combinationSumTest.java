package com.chianing.backtrace;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q039_combinationSumTest {

    Q039_combinationSum solution = new Q039_combinationSum();

    @Test
    void combinationSum() {
        LogUtil.printAfterLog(solution.combinationSum(ArrayUtil.getArray(2, 3, 6, 7), 7));
    }
}