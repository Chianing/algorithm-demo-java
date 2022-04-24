package com.chianing.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 地图分析
 * 找出离陆地最远的海洋之间距离
 * <a href="https://leetcode-cn.com/problems/as-far-from-land-as-possible/">https://leetcode-cn.com/problems/as-far-from-land-as-possible/</a>
 */
public class Q1162_MaxDistance {

    private int rowLength, lineLength;

    public int maxDistance(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        this.rowLength = grid.length;
        this.lineLength = grid[0].length;

        Queue<int[]> tmpQue = new ArrayDeque<>();
        // 多源BFS 先找出所有陆地节点
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < lineLength; j++) {
                if (grid[i][j] == 1) {
                    tmpQue.offer(new int[]{i, j});
                }
            }
        }

        // 全是陆地或全是海洋
        if (tmpQue.size() == 0 || tmpQue.size() == rowLength * lineLength) {
            return -1;
        }

        int result = -1;
        // 记录上、下、左、右节点坐标步长
        int[][] moves = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        while (!tmpQue.isEmpty()) {
            result++;
            int size = tmpQue.size();
            for (int i = 0; i < size; i++) {
                int[] node = tmpQue.poll();
                assert node != null;
                int row = node[0];
                int line = node[1];

                for (int[] move : moves) {
                    int movedRow = row + move[0];
                    int movedLine = line + move[1];
                    // 未越界 且该节点是海洋
                    if (inArea(movedRow, movedLine) && grid[movedRow][movedLine] == 0) {
                        grid[movedRow][movedLine] = -1;
                        tmpQue.offer(new int[]{movedRow, movedLine});
                    }
                }
            }
        }

        return result;

    }

    private boolean inArea(int row, int line) {
        return row >= 0 && row < rowLength &&
                line >= 0 && line < lineLength;
    }

}
