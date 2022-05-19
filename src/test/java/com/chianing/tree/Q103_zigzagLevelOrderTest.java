package com.chianing.tree;

import com.chianing.common.model.TreeNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q103_zigzagLevelOrderTest {

    Q103_zigzagLevelOrder solution = new Q103_zigzagLevelOrder();

    @Test
    void zigzagLevelOrder() {
        LogUtil.printAfterLog(solution.zigzagLevelOrder(TreeNode.getTree()));
    }
}