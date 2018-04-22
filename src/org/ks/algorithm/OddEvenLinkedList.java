package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/19.
 */
public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pPrev = head;
        ListNode p = head.next;
        ListNode pNext = p.next;

        while (p != null && p.next != null) {
            p.next = pNext.next;
            pNext.next = pPrev.next;
            pPrev.next = pNext;

            pPrev = pPrev.next;
            p = p.next;
            if (p != null)
                pNext = p.next;
            else
                pNext = null;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);


        RemoveDuplicatesFromSortedListII.printList(head);
        System.out.println();
        RemoveDuplicatesFromSortedListII.printList(oddEvenList(head));
    }
}
