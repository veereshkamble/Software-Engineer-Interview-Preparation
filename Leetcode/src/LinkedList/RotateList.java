package LinkedList;

public class RotateList {
    public Node rotateRight(Node head, int n) {
        if(head == null || head.next == null) {
            return  head;
        }
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        int i;
        for(i=0; fast.next != null; i++) {
            fast = fast.next;
        }

        for(int j = i - n % i; j > 0; j--) {
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return dummy.next;
    }
}
