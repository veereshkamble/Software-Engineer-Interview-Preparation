package LinkedList;

public class LinkedListDema {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(7);
        list.insertAtHead(19);
        list.insertAtHead(9);

        System.out.println(list);
        System.out.println("Length: " +list.length());

        list.deleteFromHead();

        System.out.println(list);
        System.out.println("Length: " +list.length());

        System.out.println("Found: " +list.findNode(7));


    }
}
