package com.chianing.offer2;

/**
 * 整数除法
 * <a href="https://leetcode.cn/problems/xoh6Oh/">https://leetcode.cn/problems/xoh6Oh/</a>
 * <p>
 * 用加法替代除法。当被除数大于除数的2倍时, 让被除数一直减去除数的2~4~8..n倍, 最后将各个倍数相加即可。
 * 注:
 * 除数的2倍=除数的1倍+除数的1倍;
 * 除数的4倍=除数的2倍+除数的2倍;
 * 除数的8倍=除数的4倍+除数的4倍;
 * <p>
 * 如15/2的计算步骤:
 * 15>8(2的4倍), 则记录4, 此时被除数变成15-8(2的4倍)即7;
 * 7>6(2的2倍), 则记录2, 此时被除数变为7-4(2的2倍)即3;
 * 3>2(2的1倍), 则记录1, 此时被除数变为3-2(2的1倍)即1, 被除数已经不小于除数的2倍了, 不需要再计算了
 * 最后结果即为4+2+1
 */
public class Q001_divide {

    public int divide(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }

        // 记录正数的个数 并将除数、被除数都转换成负数计算 避免正数计算时导致的溢出
        int positiveCnt = 0;
        if (a > 0) {
            positiveCnt++;
            a = -a;
        }
        if (b > 0) {
            positiveCnt++;
            b = -b;
        }

        int result = 0, newA = a;
        while (newA <= b) {
            int cnt = 1, newB = b;
            // 0xc0000000是Integer.MIN_VALUE的一半 这里避免除数相加时导致的溢出
            while (newB > 0xc0000000 && newA <= newB + newB) {
                // 如果新被除数(newA)大于新除数(newB)的2倍 则记录新被除数(newA)里面有几个旧除数(b)
                newB += newB;
                cnt += cnt;
            }
            result += cnt;
            newA -= newB;
        }

        return positiveCnt == 1 ? -result : result;

    }

}
