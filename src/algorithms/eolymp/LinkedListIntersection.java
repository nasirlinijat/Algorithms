package algorithms.eolymp;

public class LinkedListIntersection {

    /*
     Find the point of intersection of two singly linked lists. Return the pointer to the node
     where the intersection of two lists starts.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement a function intersection that returns a pointer to the node where the intersection
     of two singly linked lists starts.

     ListNode intersection(ListNode l1, ListNode l2)

     Example:
     l1: 1 -> 2 -> 7 -> 8 -> 9
     l2: 5 -> 6 -> 7 -> 8 -> 9 (the nodes 7, 8, 9 are shared with l1)
     Function intersection must return a pointer to the node with value 7.
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
        ListNode shared = new ListNode(7);
        shared.next = new ListNode(8);
        shared.next.next = new ListNode(9);

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = shared;

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = shared;

        System.out.println(intersection(l1, l2).val);
    }

    public static ListNode intersection(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;
        ListNode p = l1;
        ListNode q = l2;
        while (p != q) {
            p = (p == null) ? l2 : p.next;
            q = (q == null) ? l1 : q.next;
        }
        return p;
    }
}
