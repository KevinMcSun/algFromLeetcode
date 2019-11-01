package org.ks.algorithm;

public class ReorderListII {
    public static int getLength(ListNode head) {
        if (head == null)
            return 0;
        ListNode p = head;
        int cnt = 0;
        while (p != null) {
            cnt++;
            p = p.next;
        }
        return cnt;
    }
    public static void main(String[] args) {
        return;
    }
}
