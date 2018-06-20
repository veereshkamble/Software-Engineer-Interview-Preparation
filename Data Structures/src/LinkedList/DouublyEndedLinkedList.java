package LinkedList;

public class DouublyEndedLinkedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            this.head = newNode;
            this.tail = newNode;
        }

        if(tail != null) {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while(current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }
}
