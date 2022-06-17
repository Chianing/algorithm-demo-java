package com.chianing;

import com.chianing.common.model.ListNode;
import com.chianing.test.ReverseNodes;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class ReverseNodesTest {

    ReverseNodes solution = new ReverseNodes();

    @Test
    void reverseNodes() {
        LogUtil.printAfterLog(solution.reverseNodes(ListNode.getListNode(1, 2, 3, 4)));
    }

    @Test
    void reverseNodes2() {
        LogUtil.printAfterLog(solution.reverseNodes2(ListNode.getListNode(1, 2, 3, 4)));
    }

    @Test
    void reverseNodes3() {
        LogUtil.printAfterLog(solution.reverseNodes3(ListNode.getListNode(1, 2, 3, 4), 2));
    }

    @Test
    void reverseNodes4() {
        LogUtil.printAfterLog(solution.reverseNodes4(ListNode.getListNode(1, 2, 3, 4), 2));
    }
}