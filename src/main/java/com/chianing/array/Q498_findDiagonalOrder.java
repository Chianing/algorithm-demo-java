package com.chianing.array;

/**
 * 对角线遍历
 * <a href="https://leetcode.cn/problems/diagonal-traverse/">...</a>
 */
public class Q498_findDiagonalOrder {

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) {
            return new int[]{};
        }
        int lines = mat[0].length;
        if (lines == 0) {
            return new int[]{};
        }

        int row = 0, line = 0, index = 0;
        boolean flag = true;
        int count = rows * lines;
        int[] resultArr = new int[count];

        while (index < count) {
            resultArr[index++] = mat[row][line];
            int newX, newY;
            if (flag) {
                newX = row - 1;
                newY = line + 1;
            } else {
                newX = row + 1;
                newY = line - 1;
            }

            if (index < count && (newX >= rows || newY >= lines || newX < 0 || newY < 0)) {
                if (flag) {
                    newX = line + 1 < lines ? row : row + 1;
                    newY = line + 1 < lines ? line + 1 : line;
                } else {
                    newX = row + 1 < rows ? row + 1 : row;
                    newY = row + 1 < rows ? line : line + 1;
                }
                flag = !flag;
            }

            row = newX;
            line = newY;

        }

        return resultArr;

    }

}
