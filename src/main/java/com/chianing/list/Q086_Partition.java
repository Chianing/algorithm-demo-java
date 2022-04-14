package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * 分隔链表
 * <a href="https://leetcode-cn.com/problems/partition-list/">https://leetcode-cn.com/problems/partition-list/</a>
 */
public class Q086_Partition {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode partLess = new ListNode(), lessCp = partLess;
        ListNode partMoreEqual = new ListNode(), moreCp = partMoreEqual;

        while (head != null) {
            if (head.val < x) {
                lessCp.next = head;
                lessCp = lessCp.next;
            } else {
                moreCp.next = head;
                moreCp = moreCp.next;
            }
            head = head.next;
        }

        moreCp.next = null;
        lessCp.next = partMoreEqual.next;

        return partLess.next;

    }

}
