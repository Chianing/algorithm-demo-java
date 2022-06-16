package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q143_reorderListTest {

    Q143_reorderList solution = new Q143_reorderList();

    @Test
    void reorderList() {
        ListNode node = ListNode.getListNode(1, 2, 3, 4);
        solution.reorderList(node);
        LogUtil.printAfterLog(node);
    }
}