package LinkedList;

public class LinkedList {

    private Node head;

    public void insertAtHead (int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {
        int count = 0;
        Node current = this.head;

        if (head == null) {
            return count;
        } else {
            while(current != null) {
                count++;
                current = current.getNextNode();
            }
            return count;
        }
    }

    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }

    public Node findNode(int data) {
        Node current = head;

        while(current != null) {
            if(current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
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
