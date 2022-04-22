package com.chianing.algorithm;

/**
 * 排序算法
 */
public class Sort {

    /**
     * 冒泡排序
     */
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

    /**
     * 直接插入排序
     * <p>
     * 从最后一个数开始向前循环 如果插入数小于当前数 就将当前数向后移动一位
     * 将当前数放置到空着的位置
     */
    public int[] insertSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return nums;
        }

        int currentNum;
        int sortedIndex;

        for (int i = 1; i < length; i++) {
            currentNum = nums[i];
            sortedIndex = i - 1;

            while (sortedIndex >= 0 && currentNum < nums[sortedIndex]) {
                nums[sortedIndex + 1] = nums[sortedIndex];
                sortedIndex--;
            }

            nums[sortedIndex + 1] = currentNum;

        }

        return nums;

    }

}
