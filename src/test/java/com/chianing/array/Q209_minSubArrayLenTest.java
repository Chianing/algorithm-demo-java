package com.chianing.array;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q209_minSubArrayLenTest {

    Q209_minSubArrayLen solution = new Q209_minSubArrayLen();

    @Test
    void minSubArrayLen() {
        LogUtil.printAfterLog(solution.minSubArrayLen(7, ArrayUtil.getArray(2, 3, 1, 2, 4, 3)));
    }
}