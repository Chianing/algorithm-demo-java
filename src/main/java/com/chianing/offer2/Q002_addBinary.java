package com.chianing.offer2;

/**
 * 二进制加法
 * <a href="https://leetcode.cn/problems/JFETK5/">https://leetcode.cn/problems/JFETK5/</a>
 * <p>
 * 避免字符串类型转换为整数时产生溢出, 直接使用二进制计算。
 */
public class Q002_addBinary {

    public String addBinary(String a, String b) {
        if (a == null || a.trim().equals("")) {
            return b;
        }
        if (b == null || b.trim().equals("")) {
            return a;
        }

        int lengthA = a.length() - 1, lengthB = b.length() - 1, extra = 0;
        StringBuffer result = new StringBuffer();

        while (lengthA >= 0 || lengthB >= 0) {
            int subA = lengthA < 0 ? 0 : a.charAt(lengthA--) - '0';
            int subB = lengthB < 0 ? 0 : b.charAt(lengthB--) - '0';

            int subRet = subA + subB + extra;
            extra = subRet >= 2 ? 1 : 0;
            result.append(subRet >= 2 ? subRet - 2 : subRet);
        }

        // 若两个字符串都遍历完后 还有进位
        if (extra != 0) {
            result.append(extra);
        }

        return result.reverse().toString();

    }

}
