package org.ks.algorithm;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;

        // get the length of the list
        ListNode ptr1 = head;
        int len = 1;
        while (ptr1.next != null) {
            len++;
            ptr1 = ptr1.next;
        }

        int offset = k % len;
        ptr1.next = head;
        ListNode ptr2 = head;

        if (offset > 0) {
            for (int i = 0; i < len - offset - 1; i++) {
                ptr2 = ptr2.next;
            }
        }
        ListNode newHead = ptr2.next;
        ptr2.next = null;
        return newHead;
    }

    static void printList(ListNode head) {
        if (head == null)
            System.out.println("null");

        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.print("null");
        System.out.println();
        return;
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

        //printList(head);

        printList(rotateRight(head, 2));

        return;
    }
}
