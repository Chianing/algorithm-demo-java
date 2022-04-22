package com.chianing.algorithm;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q704_BinarySearchTest {

    Q704_BinarySearch solution = new Q704_BinarySearch();

    @Test
    void search() {
        int[] arr = ArrayUtil.getArray(1, 2, 3, 4);
        LogUtil.printAfterLog(solution.search(arr, 4));
        LogUtil.printAfterLog(solution.search(arr, 3));
        LogUtil.printAfterLog(solution.search(arr, 1));

    }
}