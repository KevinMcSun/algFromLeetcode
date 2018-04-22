package org.ks.algorithm;

public class PartitionList {
    public static ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;

        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);

        ListNode p = head;
        ListNode q = head1;
        ListNode k = head2;

        while (p != null) {
            if (p.val < x) {
                q.next = p;
                q = q.next;
            } else {
                k.next = p;
                k =k.next;
            }
            p = p.next;
        }
        q.next = head2.next;
        k.next = null;
        return head1.next;
    }

    public static void printList(ListNode head) {
        if (head == null)
            return;

        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        printList(partition(head, 2));
        return;
    }
}
