package com.chianing.listNode;

import com.alibaba.fastjson.JSONObject;
import com.chianing.common.model.ListNode;
import org.junit.jupiter.api.Test;

class Q002_AddTwoNumbersTest {

    Q002_AddTwoNumbers solution = new Q002_AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        ListNode result = solution.addTwoNumbers(ListNode.getListNode(1, 4, 2, 5), ListNode.getListNode(1, 4, 2, 5));
        System.out.println("addTwoNumbers() finish, result: " + JSONObject.toJSONString(result));
    }
}