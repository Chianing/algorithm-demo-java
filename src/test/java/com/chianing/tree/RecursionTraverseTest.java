package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class RecursionTraverseTest {

    RecursionTraverse solution = new RecursionTraverse();

    @Test
    void prePrint() {
        LogUtil.printAfterLog(solution.prePrint(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.prePrint(TreeNode.getTree2()));
    }

    @Test
    void midPrint() {
        LogUtil.printAfterLog(solution.midPrint(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.midPrint(TreeNode.getTree2()));
    }

    @Test
    void aftPrint() {
        LogUtil.printAfterLog(solution.aftPrint(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.aftPrint(TreeNode.getTree2()));
    }
}