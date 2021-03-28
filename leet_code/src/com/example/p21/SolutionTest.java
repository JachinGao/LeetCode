package com.example.p21;

import com.example.base.ListNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = null;

        Solution p_21 = new Solution();
        ListNode listNode = p_21.mergeTwoLists(l1, p1);
        while (listNode != null) {
            String s = listNode.next != null ? " -> " : "";
            System.out.print(listNode.val + s);
            listNode = listNode.next;
        }
    }
}