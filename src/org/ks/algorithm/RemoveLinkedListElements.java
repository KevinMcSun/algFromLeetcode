package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/19.
 */
public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        while (head != null && head.val == val)
            head = head.next;

        ListNode p = head;
        while (p != null) {
            if (p.next != null && p.next.val == val) {
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode p = head;

        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        printList(removeElements(head, 6));
    }
}
