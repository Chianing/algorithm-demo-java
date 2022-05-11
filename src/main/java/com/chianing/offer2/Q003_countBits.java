package com.chianing.offer2;

/**
 * 前n个数字二进制中1的个数
 * <a href="https://leetcode.cn/problems/w3tCBm/">https://leetcode.cn/problems/w3tCBm/</a>
 */
public class Q003_countBits {

    public int[] countBits(int n) {
        if (n == 0) {
            return new int[]{0};
        }

        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            // 如果i为偶数 则i/2相当于将i/2左移一位 即i与i/2二进制中1的个数相等
            // 如果i为奇数 则i/2相当于将i/2左移一位后加一 即i与i/2二进制中1的个数相差1
            result[i] = result[i >>> 1] + (i & 1);
        }

        return result;
    }

}
