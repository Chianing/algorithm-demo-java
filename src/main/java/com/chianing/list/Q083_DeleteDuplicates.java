package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * 删除排序链表重复元素
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/">https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/</a>
 */
public class Q083_DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slowPtr = head, fastPtr = head.next;
        while (fastPtr != null) {
            if (slowPtr.val != fastPtr.val) {
                slowPtr.next = fastPtr;
                slowPtr = fastPtr;
            }
            fastPtr = fastPtr.next;
        }
        slowPtr.next = null;

        return head;
    }

}
