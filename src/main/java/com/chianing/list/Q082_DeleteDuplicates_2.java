package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * 删除排序链表中重复节点2
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/">https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/</a>
 */
public class Q082_DeleteDuplicates_2 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyNode = new ListNode(), cur = dummyNode;
        dummyNode.next = head;

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val != cur.next.next.val) {
                cur = cur.next;
                continue;
            }

            int val = cur.next.val;
            while (cur.next != null && cur.next.val == val) {
                cur.next = cur.next.next;
            }
        }

        return dummyNode.next;

    }

}
