package com.chianing.list;

import com.chianing.common.model.ListNode;

/**
 * 两数之和
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Q002_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        int sum, tmp = 0;
        ListNode result = new ListNode();
        ListNode resultCopy = result;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                sum = l2.val + tmp;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val + tmp;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + tmp;
                l1 = l1.next;
                l2 = l2.next;
            }

            // 记录两数相加 个位的和是多少
            resultCopy.next = new ListNode(sum % 10);
            // 记录两数相加 进位是多少
            tmp = sum / 10;
            resultCopy = resultCopy.next;
        }

        if (tmp != 0) {
            resultCopy.next = new ListNode(tmp % 10);
        }

        return result.next;
    }

}
