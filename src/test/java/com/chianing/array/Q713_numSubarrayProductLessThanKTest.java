package com.chianing.array;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q713_numSubarrayProductLessThanKTest {

    Q713_numSubarrayProductLessThanK solution = new Q713_numSubarrayProductLessThanK();

    @Test
    void numSubarrayProductLessThanK() {
        LogUtil.printAfterLog(solution.numSubarrayProductLessThanK(ArrayUtil.getArray(10, 5, 2, 6), 100));
    }
}