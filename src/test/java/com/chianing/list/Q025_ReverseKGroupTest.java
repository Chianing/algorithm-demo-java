package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q025_ReverseKGroupTest {

    private static final Q025_ReverseKGroup solution = new Q025_ReverseKGroup();

    @Test
    void reverseKGroup() {
        LogUtil.printAfterLog(solution.reverseKGroup(ListNode.getListNode(1, 2, 3, 4, 5), 3));
    }

    @Test
    void reverse() {
        LogUtil.printAfterLog(solution.reverseByK(ListNode.getListNode(1, 2, 3, 4), 3));
    }
}