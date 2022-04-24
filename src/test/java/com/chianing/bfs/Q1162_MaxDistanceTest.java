package com.chianing.bfs;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q1162_MaxDistanceTest {

    Q1162_MaxDistance solution = new Q1162_MaxDistance();

    int[][] grid = new int[][]{
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
    };

    @Test
    void maxDistance() {
        LogUtil.printAfterLog(solution.maxDistance(grid));
    }
}