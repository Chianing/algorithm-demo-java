package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q086_PartitionTest {

    private static final Q086_Partition solution = new Q086_Partition();

    @Test
    void partition() {
        LogUtil.printAfterLog(solution.partition(ListNode.getListNode(1, 4, 3, 2, 5, 2), 3));
    }
}