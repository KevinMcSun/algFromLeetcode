package org.ks.algorithm;

import  org.ks.algorithm.ListNode;
/**
 * Created by Kevin on 2016/12/11.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p = head;
        ListNode q = head.next;

        while (true){
            int t = p.val;
            p.val = q.val;
            q.val = t;

            if (p.next.next != null && q.next.next != null) {
                p = p.next.next;
                q = q.next.next;
            } else {
                break;
            }
        }

        return head;
    }

    public static void main(String[] argv) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        swapNodesInPairs.swapPairs(node1);

        return;
    }
}
