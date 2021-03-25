package com.example.p24;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p2 = head.next;
        ListNode tmp = p2.next;
        p2.next = head;
        head.next = swapPairs(tmp);
        return p2;
    }


}

