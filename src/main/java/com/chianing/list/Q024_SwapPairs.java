package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * 两两交换链表相邻节点
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class Q024_SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyHead = new ListNode(), tempNode = dummyHead;
        dummyHead.next = head;

        while (tempNode.next != null && tempNode.next.next != null) {
            ListNode startNode = tempNode.next, endNode = tempNode.next.next;
            tempNode.next = endNode;
            startNode.next = endNode.next;
            endNode.next = startNode;
            tempNode = startNode;
        }

        return dummyHead.next;

    }

}
