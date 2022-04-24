package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class TraverseTest {

    Traverse solution = new Traverse();

    @Test
    void preorderTraversal() {
        LogUtil.printAfterLog(solution.preorderTraversal(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.preorderTraversal(TreeNode.getTree2()));
    }

    @Test
    void inorderTraversal() {
        LogUtil.printAfterLog(solution.inorderTraversal(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.inorderTraversal(TreeNode.getTree2()));
    }

    @Test
    void postorderTraversal() {
        LogUtil.printAfterLog(solution.postorderTraversal(TreeNode.getTree()));
        LogUtil.printAfterLog(solution.postorderTraversal(TreeNode.getTree2()));
    }
}