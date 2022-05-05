package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q111_MinDepthTest {

    Q111_MinDepth solution = new Q111_MinDepth();

    @Test
    void minDepth() {
        LogUtil.printAfterLog(solution.minDepth(TreeNode.getTree()));
        // LogUtil.printAfterLog(solution.minDepth(TreeNode.getTree2()));
    }
}