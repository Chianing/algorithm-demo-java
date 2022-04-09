package com.chianing.listNode;

import com.alibaba.fastjson.JSONObject;
import com.chianing.common.model.ListNode;
import org.junit.jupiter.api.Test;

class Q206_ReverseListNodeTest {
    private Q206_ReverseListNode solution = new Q206_ReverseListNode();

    @Test
    void reverseList1() {
        System.out.println("boundary case:");
        System.out.println("after reverse: " + JSONObject.toJSONString(solution.reverseList1(null)));
        System.out.println();

        System.out.println("single case:");
        System.out.println("after reverse: " + JSONObject.toJSONString(solution.reverseList1(ListNode.getSingleNode())));
        System.out.println();

        ListNode node = ListNode.getListNode();
        System.out.println("normal case: ");
        System.out.println("before reverse: " + JSONObject.toJSONString(node));
        System.out.println("after reverse: " + JSONObject.toJSONString(solution.reverseList1(node)));
    }

    @Test
    void reverseList2() {
        System.out.println("boundary case:");
        System.out.println("after reverse: " + JSONObject.toJSONString(solution.reverseList2(null)));
        System.out.println();

        System.out.println("single case:");
        System.out.println("after reverse: " + JSONObject.toJSONString(solution.reverseList2(ListNode.getSingleNode())));
        System.out.println();

        ListNode node = ListNode.getListNode();
        System.out.println("normal case: ");
        System.out.println("before reverse: " + JSONObject.toJSONString(node));
        System.out.println("after reverse: " + JSONObject.toJSONString(solution.reverseList2(node)));
    }
}