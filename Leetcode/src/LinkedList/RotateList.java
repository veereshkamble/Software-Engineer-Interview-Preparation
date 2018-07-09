package LinkedList;

public class RotateList {
    public Node rotateRight(Node head, int n) {
        if(head == null || head.next == null) {
            return  head;
        }

        Node fast = head;
        Node slow = head;

        int i;
        for(i=0; fast != null; i++) {
            fast = fast.next;
        }

        for(int j = i - n % i; j > 0; j--) {
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
