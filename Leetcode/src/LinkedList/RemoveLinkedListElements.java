package LinkedList;

public class RemoveLinkedListElements {

    public Node removeElements(Node head, int val) {
        if (head == null || head.next == null && head.val == val) {
            return null;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null) {
            if(curr.val == val) {
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
