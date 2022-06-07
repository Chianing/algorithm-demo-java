package com.chianing.offer2;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q051_maxPathSumTest {

    Q051_maxPathSum solution = new Q051_maxPathSum();

    @Test
    void maxPathSum() {
        LogUtil.printAfterLog(solution.maxPathSum(TreeNode.getTree()));
    }
}