package com.chianing.list;

import com.chianing.common.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 旋转链表
 * <a href="https://leetcode-cn.com/problems/rotate-list/">https://leetcode-cn.com/problems/rotate-list/</a>
 */
public class Q061_RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0 || head.next == null) {
            return head;
        }

        List<ListNode> tmpList = new ArrayList<>();
        while (head != null) {
            tmpList.add(head);
            head = head.next;
        }
        int length = tmpList.size();
        k = k % length;
        if (k == 0) {
            return tmpList.get(0);
        }

        // 从第k个节点开始截断
        tmpList.get(length - 1).next = tmpList.get(0);
        tmpList.get(length - k - 1).next = null;

        return tmpList.get(length - k);
    }

}
