package algorithms.eolymp;

public class LinkedListCycleStartingPoint {

    /*
     Given a linked list. Return pointer to the node where cycle starts. If there is no cycle, return null.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement a function detectCycle that returns a pointer to the node where cycle starts.
     If there is no cycle, return null.

     ListNode detectCycle(ListNode head)

     Example:
     For the linked list 1 -> 2 -> 3 -> 4 -> 5, function detectCycle returns null
     because the list does not contain a cycle.
     For the linked list 1 -> 2 -> 3 -> 4 -> 5 -> 3 (the last node points back to the node with value 3),
     function detectCycle returns pointer to the node with value 3 - the starting point of the cycle.
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
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println(detectCycle(head));

        fifth.next = third;
        System.out.println(detectCycle(head).val);
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
}
