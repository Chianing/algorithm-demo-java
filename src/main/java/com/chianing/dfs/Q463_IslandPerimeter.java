package com.chianing.dfs;

/**
 * 岛屿的周长
 * <a href="https://leetcode-cn.com/problems/island-perimeter/">https://leetcode-cn.com/problems/island-perimeter/</a>
 */
public class Q463_IslandPerimeter {

    private int[][] grid;
    private int rowLength, lineLength;

    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        this.grid = grid;
        this.rowLength = grid.length;
        this.lineLength = grid[0].length;

        for (int row = 0; row < rowLength; row++) {
            for (int line = 0; line < lineLength; line++) {
                if (grid[row][line] == 1) {
                    return getAreaLength(row, line);
                }
            }
        }

        return 0;

    }

    private int getAreaLength(int row, int line) {
        if (!inArea(row, line)) {
            return 1;
        }

        if (grid[row][line] == 0) {
            return 1;
        } else if (grid[row][line] == -1) {
            return 0;
        }

        grid[row][line] = -1;

        return getAreaLength(row - 1, line) +   // 上
                getAreaLength(row, line + 1) +   // 右
                getAreaLength(row + 1, line) +   // 下
                getAreaLength(row, line - 1);    // 左

    }

    private boolean inArea(int row, int line) {
        return row >= 0 && row < rowLength &&
                line >= 0 && line < lineLength;
    }

}
