package com.chianing.common.model;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

class ListNodeTest {

    @Test
    void getListNode() {
        ListNode listNode = ListNode.getListNode(1, 3, 4, 5);
        System.out.println("getListNode() finish, result: " + JSONObject.toJSONString(listNode));
    }
}