package org.ks.algorithm;

public class LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode p = head;
        ListNode q = head;

        boolean hasCycle = false;

        while (p != null && q != null) {
            p = p.next;
            if (q.next == null) {
                return null;
            }
            q = q.next.next;
            if (p == q) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle)
            return null;

        p = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
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
        ListNode p = head.next.next.next;
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = p;

        //printList(head);

        System.out.println(detectCycle(head).val);

        return;
    }
}
