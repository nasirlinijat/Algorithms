package algorithms.eolymp;

public class LinkedListRemoveCycle {

    /*
     Given a linked list. Remove a cycle in it. If there is no cycle, do nothing.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement a function removeCycle that assigns null to the next pointer of the tail
     and returns pointer to the head of the list.

     ListNode removeCycle(ListNode head)

     Example:
     For the linked list 1 -> 2 -> 3 -> 4 -> 5 -> 3 (the last node points back to the node with value 3),
     function removeCycle sets the next pointer of the tail to null and returns head:
     1 -> 2 -> 3 -> 4 -> 5.
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
        fifth.next = third;

        ListNode result = removeCycle(head);
        System.out.println(result.val);
        System.out.println(fifth.next);
    }

    public static ListNode removeCycle(ListNode head) {
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
                ListNode last = start;
                while (last.next != start) {
                    last = last.next;
                }
                last.next = null;
                break;
            }
        }
        return head;
    }
}
