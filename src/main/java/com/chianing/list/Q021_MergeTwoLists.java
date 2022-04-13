package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * 合并两个有序链表
 * <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/submissions/">https://leetcode-cn.com/problems/merge-two-sorted-lists/submissions/</a>
 */
public class Q021_MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode resultCopy = result;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                resultCopy.next = list2;
                list2 = list2.next;
                resultCopy = resultCopy.next;
                continue;
            }
            if (list2 == null) {
                resultCopy.next = list1;
                list1 = list1.next;
                resultCopy = resultCopy.next;
                continue;
            }

            if (list1.val < list2.val) {
                resultCopy.next = list1;
                list1 = list1.next;
            } else {
                resultCopy.next = list2;
                list2 = list2.next;
            }

            resultCopy = resultCopy.next;
        }

        return result.next;

    }

}
