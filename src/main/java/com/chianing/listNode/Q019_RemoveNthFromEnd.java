package com.chianing.listNode;

import com.chianing.common.model.ListNode;

/**
 * 删除链表倒数第n个节点
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class Q019_RemoveNthFromEnd {

    /**
     * 双指针
     *
     * @param head 链表头节点
     * @param n    要删除的节点
     * @return 链表头节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0 || head == null) {
            return head;
        }

        int diffCount = 0;
        ListNode slowPtrPre = head, slowPtr = head, fastPtr = head;

        // 先让快指针走到链表尾部 确定倒数第n个元素是谁
        while (fastPtr.next != null) {
            if (diffCount < n - 1) {
                diffCount++;
                fastPtr = fastPtr.next;
                continue;
            }
            slowPtrPre = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        // 如果n大于链表长度 直接返回
        if (diffCount != n - 1) {
            return head;
        }
        // 要删除的元素是头节点
        if (slowPtrPre == slowPtr) {
            return head.next;
        }
        // 删除倒数第n个节点
        slowPtrPre.next = slowPtr.next;

        return head;
    }

}
