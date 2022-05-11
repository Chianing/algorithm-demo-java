package com.chianing.offer2;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q002_addBinaryTest {

    Q002_addBinary solution = new Q002_addBinary();

    @Test
    void addBinary() {
        LogUtil.printAfterLog(solution.addBinary("101", "11"));
    }
}