package com.chianing.array;

import com.chianing.util.ArrayUtil;

/**
 * 颜色分类
 * <a href="https://leetcode.cn/problems/sort-colors/">...</a>
 */
public class Q075_sortColors {

    public void sortColors(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }

        int zero = 0, one = 0, two = length;
        while (one < two) {
            int curVal = nums[one];

            if (curVal == 0) {
                ArrayUtil.swap(nums, one, zero);
                zero++;
                one++;
            } else if (curVal == 1) {
                one++;
            } else {
                two--;
                ArrayUtil.swap(nums, one, two);
            }
        }

    }

}
