/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes
 * of the first two lists.
 */

package org.ks.algorithm;

/**
 * Created by Kevin on 10/6/2016.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        dummy1.next = l1;
        dummy2.next = l2;

        ListNode p1 = dummy1;
        ListNode p2 = dummy2;

        while(p1 != null && p2 != null){

        }

        ListNode result = new ListNode(0);

        return null;
    }
}
