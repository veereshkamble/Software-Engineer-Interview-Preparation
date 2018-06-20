package LinkedList;

public class SortedLinkedList {

    private Node head;

    public void insertSortedLinkedList(int data) {
        Node newNode = new Node(data);

        if(this.head == null) {
            this.head = newNode;
        }

        Node current = this.head;

        while(current != null && current.getNextNode().getData() < newNode.getData()) {
            current = current.getNextNode();
        }

        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);
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
