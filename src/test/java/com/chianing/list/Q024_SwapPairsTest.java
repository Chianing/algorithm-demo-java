package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q024_SwapPairsTest {

    private static final Q024_SwapPairs solution = new Q024_SwapPairs();

    @Test
    void swapPairs() {
        ListNode node1 = ListNode.getListNode(1, 2, 3, 4, 5);
        LogUtil.printBeforeLog(node1);
        LogUtil.printAfterLog(solution.swapPairs(node1));

        ListNode node2 = ListNode.getListNode(1);
        LogUtil.printBeforeLog(node2);
        LogUtil.printAfterLog(solution.swapPairs(node2));

    }
}