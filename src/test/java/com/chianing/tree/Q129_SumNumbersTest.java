package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q129_SumNumbersTest {

    Q129_SumNumbers solution = new Q129_SumNumbers();

    @Test
    void sumNumbers() {
        LogUtil.printAfterLog(solution.sumNumbers(TreeNode.getTree()));
    }
}