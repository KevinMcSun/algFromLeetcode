package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/18.
 */
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }

        int halfLen = len / 2;
        ListNode preHalf = null, postHalf = null;

        if (len % 2 == 0) {
            p = head;
            for (int i = 0; i < halfLen - 1; i++) {
                p = p.next;
            }
            ListNode q = p.next;
            p.next = null;
            preHalf = head;
            postHalf = q;
        } else {
            p = head;
            for (int i = 0; i < halfLen - 1; i++) {
                p = p.next;
            }
            ListNode q = p.next.next;
            p.next = null;
            preHalf = head;
            postHalf = q;
        }

        postHalf = ReverseLinkedList.reverseList(postHalf);

        p = preHalf;
        ListNode k = postHalf;

        for (; p != null && k != null; p = p.next, k = k.next) {
            if (p.val != k.val)
                return false;
            continue;
        }
        if (p == null && k == null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(1);
        //node1.next.next.next = new ListNode(5);
        //node1.next.next.next.next = new ListNode(2);
        //node1.next.next.next.next.next = new ListNode(2);
        //node1.next.next.next.next.next.next = new ListNode(1);
        //node1.next.next.next.next.next.next.next = new ListNode(1);

        System.out.print(isPalindrome(node1));
    }
}
