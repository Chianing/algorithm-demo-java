package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q257_binaryTreePathsTest {

    Q257_binaryTreePaths solution = new Q257_binaryTreePaths();

    @Test
    void binaryTreePaths() {
        LogUtil.printAfterLog(solution.binaryTreePaths(TreeNode.getTree()));
    }
}