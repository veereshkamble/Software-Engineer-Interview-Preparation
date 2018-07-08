package LinkedList;

public class LinkedListCycleII {
    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        //find meeting point
        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        //Check if there is a loop
        if(fast == null || fast.next == null) {
            return null;
        }

        //find the node where the cycle begins
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
