package com.example.p61;

import com.example.base.ListNode;

/**
 * 循环链表
 * 解题思路：闭合成环，再断开；
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        ListNode tmp = head;
        int n = 1;
        while (tmp.next != null) {
            tmp = tmp.next;
            n++;
        }

        //闭环
        tmp.next = head;
        int offset = n - k % n;

        while (offset > 0) {
            tmp = tmp.next;
            offset--;
        }

        ListNode header = tmp.next;
        tmp.next = null;

        return header;
    }
}
