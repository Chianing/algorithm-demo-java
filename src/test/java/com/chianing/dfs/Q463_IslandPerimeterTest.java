package com.chianing.dfs;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q463_IslandPerimeterTest {

    Q463_IslandPerimeter solution = new Q463_IslandPerimeter();

    int[][] grid = new int[][]{
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
    };

    @Test
    void islandPerimeter() {
        LogUtil.printAfterLog(solution.islandPerimeter(grid));
    }
}