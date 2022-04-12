package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q206_ReverseListNodeTest {

    private static final Q206_ReverseListNode solution = new Q206_ReverseListNode();

    @Test
    void reverseList1() {
        System.out.println("boundary case:");
        LogUtil.printAfterLog(solution.reverseList1(null));

        System.out.println("single case:");
        LogUtil.printAfterLog(solution.reverseList1(ListNode.getSingleNode()));

        ListNode node = ListNode.getListNode();
        System.out.println("normal case: ");
        LogUtil.printBeforeLog(node);
        LogUtil.printAfterLog(solution.reverseList1(node));
    }

    @Test
    void reverseList2() {
        System.out.println("boundary case:");
        LogUtil.printBeforeLog(null);
        LogUtil.printAfterLog(solution.reverseList2(null));

        System.out.println("single case:");
        LogUtil.printAfterLog(solution.reverseList2(ListNode.getSingleNode()));

        ListNode node = ListNode.getListNode();
        System.out.println("normal case: ");
        LogUtil.printBeforeLog(node);
        LogUtil.printAfterLog(solution.reverseList2(node));
    }
}