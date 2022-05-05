package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q101_IsSymmetricTest {

    Q101_IsSymmetric solution = new Q101_IsSymmetric();

    @Test
    void isSymmetric() {
        LogUtil.printAfterLog(solution.isSymmetric(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.isSymmetric(TreeNode.getTree2()));
    }
}