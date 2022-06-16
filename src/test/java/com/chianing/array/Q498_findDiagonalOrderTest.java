package com.chianing.array;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q498_findDiagonalOrderTest {

    Q498_findDiagonalOrder solution = new Q498_findDiagonalOrder();

    @Test
    void findDiagonalOrder() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        LogUtil.printAfterLog(solution.findDiagonalOrder(arr));
    }
}