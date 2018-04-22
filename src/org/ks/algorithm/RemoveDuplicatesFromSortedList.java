package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/13.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        if (head.next == null)
            return head;

        ListNode p = head;
        ListNode q = head.next;

        while (q != null) {
            if (p.val == q.val) {
                p.next = q.next;
                q = p.next;
            } else {
                q = q.next;
                p = p.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(3);

        node1.next = null;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        removeDuplicatesFromSortedList.deleteDuplicates(node1);
    }
}
