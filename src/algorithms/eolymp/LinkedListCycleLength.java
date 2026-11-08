package algorithms.eolymp;

public class LinkedListCycleLength {

    /*
     Given a linked list. Find the length of its cycle. If there is no cycle, return -1.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement a function CycleLength that returns a length of a cycle.
     If there is no cycle, return -1.

     int CycleLength(ListNode head)

     Example:
     For the linked list 1 -> 2 -> 3 -> 4 -> 5, function CycleLength returns -1
     because the list does not contain a cycle.
     For the linked list 1 -> 2 -> 3 -> 4 -> 5 -> 3 (the last node points back to the node with value 3),
     function CycleLength returns 3 - the length of the cycle (3 -> 4 -> 5 -> 3).
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
        System.out.println(CycleLength(head));

        fifth.next = third;
        System.out.println(CycleLength(head));
    }

    public static int CycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int length = 1;
                ListNode cur = slow.next;
                while (cur != slow) {
                    cur = cur.next;
                    length++;
                }
                return length;
            }
        }
        return -1;
    }
}
