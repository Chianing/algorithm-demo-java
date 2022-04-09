package com.chianing.common.model;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    public static ListNode getSingleNode() {
        return getListNode(1);
    }

    public static ListNode getListNode() {
        return getListNode(1, 5, 2, 4);
    }

    public static ListNode getListNode(int... vals) {
        if (vals.length == 0) {
            return null;
        }

        ListNode result = new ListNode();
        ListNode resultCopy = result;
        for (int val : vals) {
            resultCopy.next = new ListNode(val);
            resultCopy = resultCopy.next;
        }

        return result.next;
    }

}
