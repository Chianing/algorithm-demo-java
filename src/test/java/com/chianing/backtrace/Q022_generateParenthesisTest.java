package com.chianing.backtrace;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q022_generateParenthesisTest {

    Q022_generateParenthesis solution = new Q022_generateParenthesis();

    @Test
    void generateParenthesis() {
        LogUtil.printAfterLog(solution.generateParenthesis(3));
    }
}