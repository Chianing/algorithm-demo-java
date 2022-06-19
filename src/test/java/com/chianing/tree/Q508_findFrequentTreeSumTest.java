package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q508_findFrequentTreeSumTest {

    Q508_findFrequentTreeSum solution = new Q508_findFrequentTreeSum();

    @Test
    void findFrequentTreeSum() {
        LogUtil.printAfterLog(solution.findFrequentTreeSum(TreeNode.getTree()));
    }
}