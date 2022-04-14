package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q082_DeleteDuplicates_2Test {

    private static final Q082_DeleteDuplicates_2 solution = new Q082_DeleteDuplicates_2();

    @Test
    void deleteDuplicates() {
        LogUtil.printAfterLog(solution.deleteDuplicates(ListNode.getListNode(1, 2, 3, 3, 4, 4, 5)));
    }
}