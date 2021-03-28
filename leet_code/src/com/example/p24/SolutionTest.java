package com.example.p24;

import com.example.base.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void swapPairs() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode head = new ListNode();

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;

        Solution p_24 = new Solution();
        reverse(l1);
        ListNode listNode = p_24.swapPairs(l1);
        System.out.println("\n");
        reverse(listNode);
    }


    private void reverse(ListNode node) {
        ListNode list = node;
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }
}