package com.chianing.array;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q442_findDuplicatesTest {

    Q442_findDuplicates solution = new Q442_findDuplicates();

    @Test
    void findDuplicates() {
        LogUtil.printAfterLog(solution.findDuplicates(ArrayUtil.getArray(1, 2, 1, 3, 5, 6, 3)));
    }
}