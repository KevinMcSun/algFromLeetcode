package org.ks.algorithm;

import java.util.Random;

/**
 * Created by Kevin on 2017/1/19.
 */
public class LinkedListRandomNode {
    public int len = 0;
    public ListNode list = null;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        if (head == null)
            this.len = 0;

        this.list = head;

        ListNode p = list;
        while (p != null) {
            len++;
            p = p.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        Random r = new Random();
        int rn = Math.abs(r.nextInt() % len);
        System.out.println("random = " + rn);
        ListNode p = list;
        for (int i = 1; i < rn; i++) {
            p = p.next;
        }

        return p.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        LinkedListRandomNode obj = new LinkedListRandomNode(head);
        System.out.println(obj.getRandom());
    }
}
