package LinkedList;

public class LinkedListIntersection {

    public int length(Node node) {
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}
