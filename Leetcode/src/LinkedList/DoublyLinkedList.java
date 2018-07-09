package LinkedList;

public class DoublyLinkedList {
    DoublyListNode head;

    public DoublyLinkedList() {
        head = null;
    }

    private DoublyListNode getTail() {
        DoublyListNode curr = head;
        while(curr != null && curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    public int get(int index) {
        DoublyListNode curr = getNode(index);
        return curr == null ? -1 : curr.val;
    }
    
}
