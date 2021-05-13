package com.offer.p06;

import com.offer.base.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reversePrint() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        l1.next = l3;
        l3.next = l2;
        int[] arr = solution.reversePrint(l1);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}