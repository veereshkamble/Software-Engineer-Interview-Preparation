package LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        if(head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;
        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    
}
