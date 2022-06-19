package com.chianing.other;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q014_longestCommonPrefixTest {

    Q014_longestCommonPrefix solution = new Q014_longestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String[] strs = new String[]{"abc", "abd", "ad"};
        LogUtil.printAfterLog(solution.longestCommonPrefix(strs));
    }
}