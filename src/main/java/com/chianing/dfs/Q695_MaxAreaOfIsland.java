package com.chianing.dfs;

/**
 * 岛屿的最大面积
 * <a href="https://leetcode-cn.com/problems/max-area-of-island/">https://leetcode-cn.com/problems/max-area-of-island/</a>
 */
public class Q695_MaxAreaOfIsland {

    private int[][] grid;
    private int rowLength, lineLength;

    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        this.grid = grid;
        this.rowLength = grid.length;
        this.lineLength = grid[0].length;

        int maxArea = 0;

        for (int row = 0; row < rowLength; row++) {
            for (int line = 0; line < lineLength; line++) {
                if (grid[row][line] == 1) {
                    int area = getArea(row, line);
                    maxArea = Math.max(area, maxArea);
                }
            }

        }

        return maxArea;

    }

    private int getArea(int row, int line) {
        if (!inArea(row, line)) {   // 出界
            return 0;
        }
        if (grid[row][line] != 1) { // 海洋 或者已经访问过的节点
            return 0;
        }

        grid[row][line] = 2;    // 标记该节点已经访问过了

        return 1 +
                getArea(row - 1, line) +   // 上
                getArea(row, line + 1) +   // 右
                getArea(row + 1, line) +   // 下
                getArea(row, line - 1);    // 左

    }

    private boolean inArea(int row, int line) {
        return row >= 0 && row < rowLength &&
                line >= 0 && line < lineLength;
    }

}
