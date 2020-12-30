public class P_24 {
    public static void main(String[] args) {
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

        P_24 p_24 = new P_24();
        p_24.reverse(l1);
        ListNode listNode = p_24.swapPairs(l1);
        System.out.println("\n");
        p_24.reverse(listNode);
    }

    private void reverse(ListNode node) {
        ListNode list = node;
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }

    private static class ListNode {
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
