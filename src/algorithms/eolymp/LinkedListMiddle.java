package algorithms.eolymp;

public class LinkedListMiddle {

    /*
     Given a linked list, find its middle element.

     Definition of a single linked list:

     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
         val = x;
         next = null;
       }
     }

     Implement a function MiddleElement that returns a pointer to the middle node. If linked list
     contains n elements, its middle element has index number ceil(n/2).

     ListNode MiddleElement(ListNode head)

     Input
     The function receives a pointer head to the head of the linked list.

     Output
     The function should return a pointer to the middle element of the list.

     Example:
     n = 5: 1 -> 2 -> 3 -> 4 -> 5. Function must return a pointer to the node with value 3.
     n = 4: 1 -> 2 -> 3 -> 4. Function must return a pointer to the node with value 2.
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
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(MiddleElement(head).val);
    }

    public static ListNode MiddleElement(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
