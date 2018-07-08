package LinkedList;

public class RemoveNthNodeFromTheEnd {

    public Node removeNthNode(Node head, int n) {
        LinkedListIntersection linkedListIntersection = new LinkedListIntersection();
        int length = linkedListIntersection.length(head);
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

    public Node removeNthFromEnd(Node head, int n) {

        Node start = new Node(0);
        Node slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }
}
