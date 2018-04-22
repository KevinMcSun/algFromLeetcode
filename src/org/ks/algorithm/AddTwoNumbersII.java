package org.ks.algorithm;

/**
 * Created by Kevin on 2017/1/19.
 */
public class AddTwoNumbersII {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder("");
        ListNode p = l1;
        while (p != null) {
            sb.append(String.valueOf(p.val));
            p = p.next;
        }

        String s1 = sb.toString();
        sb.setLength(0);

        p = l2;
        while (p != null) {
            sb.append(String.valueOf(p.val));
            p = p.next;
        }

        String s2 = sb.toString();

        String r = AddStrings.addStrings(s1, s2);

        ListNode reslut = new ListNode(Integer.valueOf(r.charAt(0) - '0'));
        p = reslut;

        for (int i = 1; i < r.length(); i++) {
            p.next = new ListNode(Integer.valueOf(r.charAt(i) - '0'));
            p = p.next;
        }

        return reslut;
    }

    public static void main(String[] args) {
        ListNode s1 = new ListNode(9);
        s1.next = new ListNode(9);
        s1.next.next = new ListNode(3);
        s1.next.next.next = new ListNode(3);

        ListNode s2 = new ListNode(1);
        s2.next = new ListNode(2);
        s2.next.next = new ListNode(9);

        RemoveDuplicatesFromSortedListII.printList(addTwoNumbers(s1, s2));
    }
}
