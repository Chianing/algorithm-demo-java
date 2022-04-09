package com.chianing.common.model;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class ListNodeTest {

    @Test
    void getListNode() {
        ListNode listNode = ListNode.getListNode(1, 3, 4, 5);
        LogUtil.printAfterLog(listNode);
    }
}