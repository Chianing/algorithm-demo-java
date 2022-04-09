package com.chianing.listNode;

import com.chianing.common.model.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 合并k个升序链表
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
public class Q023_MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = new ListNode();
        ListNode resultCopy = result;

        // 先用最小堆存取每个链表的头节点 即每个链表的最小值
        PriorityQueue<ListNode> tmpQue = new PriorityQueue<>(lists.length, Comparator.comparingInt(o -> o.val));
        for (ListNode list : lists) {
            if (list != null) {
                tmpQue.offer(list);
            }
        }

        // 依次从最小堆中取出最小值 取出后 再以该链表的下一个节点补充进去
        while (!tmpQue.isEmpty()) {
            ListNode node = tmpQue.poll();
            resultCopy.next = node;
            if (node.next != null) {
                tmpQue.add(node.next);
            }
            resultCopy = resultCopy.next;
        }

        return result.next;
    }

}
