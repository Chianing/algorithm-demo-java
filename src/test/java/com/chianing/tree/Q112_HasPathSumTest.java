package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q112_HasPathSumTest {

    Q112_HasPathSum solution = new Q112_HasPathSum();

    @Test
    void hasPathSum() {
        LogUtil.printAfterLog(solution.hasPathSum(TreeNode.getTree(), 12));
        LogUtil.printAfterLog(solution.hasPathSum(TreeNode.getTree(), 10));
        LogUtil.printAfterLog(solution.hasPathSum(TreeNode.getTree(), 38));
    }
}