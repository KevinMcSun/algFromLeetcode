package org.ks.algorithm;

/**
 * Created by Kevin on 10/5/2016.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode _removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p = dummy;
        ListNode q = dummy;
        for(int i = 0; i <= n; i++){
            if(p.next != null)
                p = p.next;
        }
        while (p != null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
