package algorithms.eolymp;

public class LinkedListSum {

    /*
     Given a linked list, find the sum of its elements.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement function sum that finds the sum of linked list elements.

     int sum(ListNode head)

     Example:
     The sum of elements of a linked list 1 -> 2 -> 3 is 6.
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
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(sum(head));
    }

    public static int sum(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum += head.val;
            head = head.next;
        }
        return sum;
    }
}
