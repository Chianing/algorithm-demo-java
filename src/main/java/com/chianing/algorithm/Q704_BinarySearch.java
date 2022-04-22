package com.chianing.algorithm;

/**
 * 二分查找
 * <a href="https://leetcode-cn.com/problems/binary-search/">https://leetcode-cn.com/problems/binary-search/</a>
 */
public class Q704_BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1, mid;
        if (nums[start] > target || nums[end] < target) {
            return -1;
        }

        while (start <= end) {
            mid = (end + start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
