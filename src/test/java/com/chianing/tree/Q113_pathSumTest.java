package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q113_pathSumTest {

    Q113_pathSum solution = new Q113_pathSum();

    @Test
    void pathSum() {
        LogUtil.printAfterLog(solution.pathSum(TreeNode.getTree(), 12));
        LogUtil.printAfterLog(solution.pathSum(TreeNode.getTree(), 30));
    }
}