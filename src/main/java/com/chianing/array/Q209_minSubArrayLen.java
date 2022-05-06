package com.chianing.array;

/**
 * 长度最小的子数组
 * <a href="https://leetcode-cn.com/problems/minimum-size-subarray-sum/">https://leetcode-cn.com/problems/minimum-size-subarray-sum/</a>
 */
public class Q209_minSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 0, right = 0, minLen = Integer.MAX_VALUE, sum = 0;

        while (right < nums.length) {
            if (nums[right] >= target) {
                return 1;
            }

            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }

}
