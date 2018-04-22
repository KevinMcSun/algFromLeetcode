package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/9.
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        ListNode p = new ListNode(head.val);
        ListNode q = head.next;

        while (q != null) {
            ListNode t = new ListNode(q.val);
            t.next = p;
            p = t;
            q = q.next;
        }

        return p;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        head.next = node1;
        node1.next = node2;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList(head);
        return;
    }
}
