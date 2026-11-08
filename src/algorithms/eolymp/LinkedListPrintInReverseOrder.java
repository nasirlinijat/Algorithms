package algorithms.eolymp;

public class LinkedListPrintInReverseOrder {

    /*
     Given a linked list. Print its elements in reverse order.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement function PrintReverse that prints the elements of linked list in the reverse order.

     void PrintReverse(ListNode head)

     Example:
     For the linked list 1 -> 2 -> 3, function PrintReverse must print in one line
     the elements in the reverse order: 3 2 1.
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
        PrintReverse(head);
    }

    public static void PrintReverse(ListNode head) {
        if (head == null) return;
        if (head.next != null) PrintReverse(head.next);
        System.out.print(head.val + " ");
    }
}
