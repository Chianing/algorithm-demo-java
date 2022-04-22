package com.chianing.algorithm;

/**
 * 冒泡排序
 */
public class SortBubble {

    public int[] bubbleSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int tmp;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        return nums;
    }

}
