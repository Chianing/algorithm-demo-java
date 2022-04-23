package com.chianing.algorithm;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class SortTest {

    Sort solution = new Sort();
    int[] nums1 = ArrayUtil.getArray(3, 4, 2, 1);
    int[] nums2 = ArrayUtil.getArray(8, 9, 1, 7, 2, 3, 5, 4, 6, 0);

    @Test
    void bubbleSort() {
        LogUtil.printAfterLog(solution.bubbleSort(nums1));
        LogUtil.printAfterLog(solution.bubbleSort(nums2));
    }

    @Test
    void insertSort() {
        LogUtil.printAfterLog(solution.insertSort(nums1));
        LogUtil.printAfterLog(solution.insertSort(nums2));
    }

    @Test
    void shellSort() {
        // LogUtil.printAfterLog(solution.shellSort(nums1));
        LogUtil.printAfterLog(solution.shellSort(nums2));
    }
}