package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q021_MergeTwoListsTest {

    private static final Q021_MergeTwoLists solution = new Q021_MergeTwoLists();

    @Test
    void mergeTwoLists() {
        LogUtil.printAfterLog(solution.mergeTwoLists(ListNode.getListNode(1, 3, 5), ListNode.getListNode(2, 6)));
    }
}