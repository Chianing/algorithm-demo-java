package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q023_MergeKListsTest {

    private static final Q023_MergeKLists solution = new Q023_MergeKLists();

    @Test
    void mergeKLists() {
        ListNode node1 = ListNode.getListNode(1, 4, 5);
        ListNode node2 = ListNode.getListNode(1, 3, 4);
        ListNode node3 = ListNode.getListNode(2, 6);

        ListNode[] nodes = new ListNode[]{node1, node2, node3};

        LogUtil.printAfterLog(solution.mergeKLists(nodes));

    }
}