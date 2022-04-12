package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q002_AddTwoNumbersTest {

    private static final Q002_AddTwoNumbers solution = new Q002_AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        ListNode result = solution.addTwoNumbers(ListNode.getListNode(1, 4, 2, 5), ListNode.getListNode(1, 4, 2, 5));
        LogUtil.printAfterLog(result);
    }
}