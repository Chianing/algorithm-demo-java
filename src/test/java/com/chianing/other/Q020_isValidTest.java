package com.chianing.other;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q020_isValidTest {

    Q020_isValid solution = new Q020_isValid();

    @Test
    void isValid() {
        LogUtil.printAfterLog(solution.isValid("{{{}}}"));
        LogUtil.printAfterLog(solution.isValid("{()[(])}"));
    }
}