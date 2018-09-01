package LinkedList;

public class DeleteNode {

    public void deleteNode(Node node) {

        Node cur = node;
        while(cur.next != null) {
            Node next = cur.next;

            cur.val = cur.next.val;
            cur.next = cur.next.next;

            cur = next;
        }



    }
}
