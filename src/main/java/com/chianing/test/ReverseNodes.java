package com.chianing.test;

import com.chianing.common.model.ListNode;

public class ReverseNodes {

    private ListNode result;

    // 递归反转链表
    public ListNode reverseNodes(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        reverse(null, node);
        return result;
    }

    private void reverse(ListNode pre, ListNode cur) {
        if (cur == null) {
            result = pre;
            return;
        }

        reverse(cur, cur.next);
        cur.next = pre;
    }

    // 迭代反转链表
    public ListNode reverseNodes2(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode pre = null, cur = node, tmpNode;
        while (cur != null) {
            tmpNode = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmpNode;
        }

        return pre;
    }

    // 反转链表前k个节点
    public ListNode reverseNodes3(ListNode node, int k) {
        if (node == null || node.next == null || k <= 1) {
            return node;
        }

        int count = 1;
        ListNode tmpNode = null, pre = node, cur = node.next;

        while (count < k) {
            if (cur == null) {
                return node;
            }

            tmpNode = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmpNode;
            count++;
        }

        node.next = tmpNode;
        return pre;
    }

    // k个一组反转节点
    public ListNode reverseNodes4(ListNode node, int k) {
        if (node == null || node.next == null || k <= 1) {
            return node;
        }

        int count = 0;
        ListNode dummy = new ListNode(), pre = dummy, end = dummy;
        dummy.next = node;

        while (end.next != null) {
            while (count < k && end != null) {
                end = end.next;
                count++;
            }
            if (end == null) {
                break;
            }

            ListNode start = pre.next;
            ListNode next = end.next;
            // 截断区间内链表 对该部分进行反转
            end.next = null;

            // 反转后的片段重新拼接回来
            pre.next = reverse(start);
            start.next = next;

            pre = start;
            end = pre;
            count = 0;
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return null;
        }

        ListNode pre = null, cur = node, tmp;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmp;
        }

        return pre;
    }

}
