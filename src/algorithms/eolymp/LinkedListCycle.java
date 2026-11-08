package algorithms.eolymp;

public class LinkedListCycle {

    /*
     Given a linked list. Does it contain a cycle?

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement a function hasCycle that returns 1 if linked list contains a cycle and 0 otherwise.
     It is forbidden to change the values of the list elements.

     int hasCycle(ListNode head)

     Example:
     For the linked list 1 -> 2 -> 3, function hasCycle returns 0 because the list does not contain a cycle.
     For the linked list 1 -> 2 -> 3 -> 2 (the last node points back to the second one),
     function hasCycle returns 1 because the list contains a cycle.
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
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        System.out.println(hasCycle(head));

        third.next = second;
        System.out.println(hasCycle(head));
    }

    public static int hasCycle(ListNode head) {
        if (head == null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return 1;
        }
        return 0;
    }
}
