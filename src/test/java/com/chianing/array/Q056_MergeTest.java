package com.chianing.array;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q056_MergeTest {

    private static final Q056_Merge solution = new Q056_Merge();

    @Test
    void merge() {
        // int[][] arr = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        // int[][] arr = new int[][]{{1, 4}, {2, 3}};
        int[][] arr = new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        LogUtil.printAfterLog(solution.merge(arr));
    }
}