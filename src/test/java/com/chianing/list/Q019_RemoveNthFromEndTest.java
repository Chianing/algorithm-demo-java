package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q019_RemoveNthFromEndTest {

    private static final Q019_RemoveNthFromEnd solution = new Q019_RemoveNthFromEnd();

    @Test
    void removeNthFromEnd() {
        LogUtil.printAfterLog(solution.removeNthFromEnd(ListNode.getSingleNode(), 1));
        LogUtil.printAfterLog(solution.removeNthFromEnd(ListNode.getListNode(1, 2, 3), 1));
        LogUtil.printAfterLog(solution.removeNthFromEnd(ListNode.getListNode(1, 2, 3), 3));
    }
}