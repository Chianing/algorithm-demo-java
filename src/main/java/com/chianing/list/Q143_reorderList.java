package com.chianing.list;

import com.chianing.common.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 重排链表
 * <a href="https://leetcode.cn/problems/reorder-list/">...</a>
 */
public class Q143_reorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> nodeList = new ArrayList<>();
        ListNode headCopy = head;

        while (headCopy != null) {
            nodeList.add(headCopy);
            headCopy = headCopy.next;
        }

        int start = 0, end = nodeList.size() - 1;
        while (start < end) {
            ListNode startNode = nodeList.get(start);
            ListNode tmpNode = startNode.next;
            ListNode endNode = nodeList.get(end);

            startNode.next = endNode;
            endNode.next = tmpNode;
            start++;
            end--;
        }

        nodeList.get(start).next = null;

    }

}
