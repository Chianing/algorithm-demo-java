package com.chianing.listNode;

import com.chianing.common.model.ListNode;

import java.util.Stack;

/**
 * 反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
public class Q206_ReverseListNode {

    private ListNode result;

    /**
     * 递归反转
     *
     * @param head 头节点
     * @return 反转后的头节点
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }

        subReverseListNode(null, head);

        return result;
    }

    private void subReverseListNode(ListNode pre, ListNode node) {
        // 最后一个节点
        if (node == null) {
            result = pre;
            return;
        }

        subReverseListNode(node, node.next);
        node.next = pre;
    }

    /**
     * 通过栈反转
     *
     * @param head 头节点
     * @return 反转后的头节点
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> tempStack = new Stack<>();
        while (head != null) {
            tempStack.push(head);
            head = head.next;
        }

        // 记录反转后的头节点
        result = tempStack.peek();

        while (!tempStack.isEmpty()) {
            ListNode node = tempStack.pop();
            node.next = tempStack.isEmpty() ? null : tempStack.peek();
        }

        return result;
    }

}
