package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/18.
 */
public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p = head;
        ListNode q = head.next;

        ListNode r = null;

        while (p.next != null) {
            if (p.val == p.next.val) {
                while (p.val == p.next.val)
                    p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return r;
    }

    public static void printList(ListNode list) {
        ListNode p = list;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(2);
        node1.next.next.next = new ListNode(2);
        node1.next.next.next.next = new ListNode(2);
        node1.next.next.next.next.next = new ListNode(2);
        node1.next.next.next.next.next.next = new ListNode(3);

        printList(deleteDuplicates(node1));
    }
}
