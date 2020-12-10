import java.util.List;

public class P_21 {
    public static void main(String[] args) {
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

        P_21 p_21 = new P_21();
        ListNode listNode = p_21.mergeTwoLists(l1, p1);
        while (listNode != null) {
            String s = listNode.next != null ? " -> " : "";
            System.out.print(listNode.val + s);
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                p = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                p = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
