package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * k个为一组反转链表
 * <a href="https://leetcode-cn.com/problems/reverse-nodes-in-k-group/">https://leetcode-cn.com/problems/reverse-nodes-in-k-group/</a>
 */
public class Q025_ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        int cnt = 0;
        ListNode startNode = head, endNode = head, result = new ListNode(), resultCopy = result;

        while (endNode != null) {
            // 先确认该段是否需要反转
            if (cnt != k - 1) {
                cnt++;
                endNode = endNode.next;
                continue;
            }
            // 拼接每段反转后的头节点
            resultCopy.next = reverseByK(startNode, k);
            resultCopy = startNode;
            startNode = startNode.next;
            endNode = startNode;
            cnt = 0;
        }

        return result.next;
    }

    /**
     * 反转链表的前k个节点
     */
    public ListNode reverseByK(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        int cnt = 0;
        ListNode slowPtr = null, fastPtr = head, tmpPtr;

        while (fastPtr != null) {
            if (cnt == k) {
                break;
            }
            tmpPtr = fastPtr.next;
            fastPtr.next = slowPtr;
            slowPtr = fastPtr;
            fastPtr = tmpPtr;
            cnt++;
        }

        // 反转后的链表尾节点 链接该链表无需反转的部分
        head.next = fastPtr;

        return slowPtr;

    }

}
