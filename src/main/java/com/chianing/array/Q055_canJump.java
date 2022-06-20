package com.chianing.array;

/**
 * 跳跃游戏
 * <a href="https://leetcode.cn/problems/jump-game/">...</a>
 */
public class Q055_canJump {

    public boolean canJump(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return true;
        }

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false;
            }
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return true;

    }

}
