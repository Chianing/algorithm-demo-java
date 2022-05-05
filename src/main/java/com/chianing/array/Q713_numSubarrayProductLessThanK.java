package com.chianing.array;

/**
 * 乘积小于k的连续子数组
 * <a href="https://leetcode-cn.com/problems/subarray-product-less-than-k/">https://leetcode-cn.com/problems/subarray-product-less-than-k/</a>
 */
public class Q713_numSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length == 0 || k <= 1) {
            return 0;
        }

        int leftIndex = 0, rightIndex = 0, result = 0, mul = 1;

        while (rightIndex < nums.length) {
            mul = mul * nums[rightIndex];
            while (mul >= k) {
                mul /= nums[leftIndex];
                leftIndex++;
            }

            result += (rightIndex - leftIndex + 1);
            rightIndex++;
        }

        return result;

    }

}
