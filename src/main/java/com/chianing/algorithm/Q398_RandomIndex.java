package com.chianing.algorithm;

import java.util.Random;

/**
 * 随机数索引
 * <a href="https://leetcode-cn.com/problems/random-pick-index/">https://leetcode-cn.com/problems/random-pick-index/</a>
 */
public class Q398_RandomIndex {

    private final int[] nums;
    private final Random random = new Random();

    public Q398_RandomIndex(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        int result = -1;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                cnt++;
                if (random.nextInt(cnt) == 0) {
                    result = i;
                }
            }
        }

        return result;
    }

}
