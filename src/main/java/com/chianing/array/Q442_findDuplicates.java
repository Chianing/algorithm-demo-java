package com.chianing.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数组中的重复数据
 * <a href="https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/">https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/</a>
 */
public class Q442_findDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] > 0) {
                nums[Math.abs(num) - 1] *= -1;
            } else {
                resultList.add(Math.abs(num));
            }
        }

        return resultList;
    }

}
