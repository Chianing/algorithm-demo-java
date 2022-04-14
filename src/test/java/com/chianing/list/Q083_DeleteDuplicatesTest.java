package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q083_DeleteDuplicatesTest {

    private static final Q083_DeleteDuplicates solution = new Q083_DeleteDuplicates();

    @Test
    void deleteDuplicates() {
        LogUtil.printAfterLog(solution.deleteDuplicates(ListNode.getListNode(1, 2, 2, 3, 4, 4)));
    }
}