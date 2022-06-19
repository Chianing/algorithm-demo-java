package com.chianing.array;

import java.util.Arrays;

/**
 * 最接近的三数之和
 * <a href="https://leetcode.cn/problems/3sum-closest/">...</a>
 */
public class Q016_threeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return -1;
        }

        Arrays.sort(nums);
        int start, end, newSum;
        int sum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {
            start = i + 1;
            end = nums.length - 1;

            while (start < end) {
                newSum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) > Math.abs(target - newSum)) {
                    sum = newSum;
                }
                if (newSum > target) {
                    end--;
                } else if (newSum < target) {
                    start++;
                } else {
                    return sum;
                }
            }

        }

        return sum;

    }

}
