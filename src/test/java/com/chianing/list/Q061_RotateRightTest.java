package com.chianing.list;

import com.chianing.common.model.ListNode;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q061_RotateRightTest {

    private static final Q061_RotateRight solution = new Q061_RotateRight();

    @Test
    void rotateRight() {
        LogUtil.printAfterLog(solution.rotateRight(ListNode.getListNode(1, 2, 3, 4, 5), 2));
    }
}