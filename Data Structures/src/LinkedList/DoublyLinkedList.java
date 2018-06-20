package LinkedList;

public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if(head == null) {
            this.head = newNode;
            head.setNextNode(null);
            head.setPrevNode(null);
        } else {
            newNode.setNextNode(this.head);
            this.head.setPrevNode(newNode);
            this.head = newNode;
        }
    }

    public int length() {
        if(head == null) {
            return 0;
        }

        int count = 0;
        DoublyLinkedNode current = this.head;
        while(current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "{";
        DoublyLinkedNode current = this.head;

        while(current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
