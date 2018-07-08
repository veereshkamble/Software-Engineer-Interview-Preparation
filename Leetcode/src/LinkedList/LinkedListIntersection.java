package LinkedList;

public class LinkedListIntersection {

    public Node getIntersectionNode(Node headA, Node headB) {
        int lengthA = length(headA);
        int lengthB = length(headB);

        Node nodeA = headA;
        Node nodeB = headB;

        while(lengthA > lengthB) {
            nodeA = nodeA.next;
            lengthA--;
        }

        while(lengthA < lengthB) {
            nodeB = nodeB.next;
            lengthB--;
        }

        while(nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return nodeA;
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
