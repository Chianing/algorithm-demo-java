package com.chianing.other;

/**
 * 最长公共前缀
 * <a href="https://leetcode.cn/problems/longest-common-prefix/">...</a>
 */
public class Q014_longestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String subStr = strs[i];
            int j = 0;
            for (; j < result.length() && j < subStr.length(); j++) {
                if (result.charAt(j) != subStr.charAt(j)) {
                    break;
                }
            }
            result = result.substring(0, j);
            if ("".equals(result)) {
                return result;
            }
        }

        return result;

    }

}
