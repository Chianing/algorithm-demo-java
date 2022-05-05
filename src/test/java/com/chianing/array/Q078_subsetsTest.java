package com.chianing.array;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q078_subsetsTest {

    Q078_subsets solution = new Q078_subsets();

    @Test
    void subsets() {
        LogUtil.printAfterLog(solution.subsets(ArrayUtil.getArray(1, 2, 3)));
    }
}