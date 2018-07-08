package LinkedList;

public class RemoveNthNodeFromTheEnd {

    public Node removeNthNode(Node head, int n) {
        int length = length(head);
        length = length - n;
        int count = 1;
        Node node = head;

        if(node == null || node.next == null) {
            return null;
        }

        if(length == 0) {
            return node.next;
        }

        while(count < length) {
            node = node.next;
            count++;
        }
        node.next = node.next.next;

        return head;
    }

    public int length(Node node) {
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}
