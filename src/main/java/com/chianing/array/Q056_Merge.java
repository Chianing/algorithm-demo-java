package com.chianing.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 * <a href="https://leetcode-cn.com/problems/merge-intervals/">https://leetcode-cn.com/problems/merge-intervals/</a>
 */
public class Q056_Merge {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals[0].length == 0) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> resultList = new ArrayList<>();
        for (int[] interval : intervals) {
            int low = interval[0], high = interval[1];
            int size = resultList.size();

            if (size == 0 || resultList.get(size - 1)[1] < low) {
                resultList.add(new int[]{low, high});
            } else {
                resultList.get(size - 1)[1] = Math.max(resultList.get(size - 1)[1], high);
            }
        }

        return resultList.toArray(new int[resultList.size()][]);
    }

}
