package LinkedList;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtHead(5);
        doublyLinkedList.insertAtHead(7);
        doublyLinkedList.insertAtHead(9);
        doublyLinkedList.insertAtHead(10);

        System.out.println(doublyLinkedList.toString());
    }
}
