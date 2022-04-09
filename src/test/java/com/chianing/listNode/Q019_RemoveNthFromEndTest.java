package com.chianing.listNode;

import com.alibaba.fastjson.JSONObject;
import com.chianing.common.model.ListNode;
import org.junit.jupiter.api.Test;

class Q019_RemoveNthFromEndTest {

    Q019_RemoveNthFromEnd solution = new Q019_RemoveNthFromEnd();

    @Test
    void removeNthFromEnd() {
        // System.out.println("removeNthFromEnd() done, result: " + JSONObject.toJSONString(solution.removeNthFromEnd(ListNode.getSingleNode(), 1)));
        // System.out.println("removeNthFromEnd() done, result: " + JSONObject.toJSONString(solution.removeNthFromEnd(ListNode.getListNode(1, 2, 3), 1)));
        // System.out.println("removeNthFromEnd() done, result: " + JSONObject.toJSONString(solution.removeNthFromEnd(ListNode.getListNode(1, 2, 3), 3)));
        System.out.println("removeNthFromEnd() done, result: " + JSONObject.toJSONString(solution.removeNthFromEnd(ListNode.getListNode(1, 2), 1)));
    }
}