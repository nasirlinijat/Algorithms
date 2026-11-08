package algorithms.eolymp;

public class LinkedListMerge {

    /*
     Merge two sorted linked lists and return it as a new list. The new list should be made
     by splicing together the nodes of the first two lists.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement function merge that merges two linked lists.

     ListNode merge(ListNode l1, ListNode l2)

     Example:
     l1: 1 -> 2 -> 4
     l2: 1 -> 3 -> 4
     Result: 1 -> 1 -> 2 -> 3 -> 4 -> 4
     */

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode merged = merge(l1, l2);
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}
