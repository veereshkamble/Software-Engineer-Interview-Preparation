package LinkedList;

public class MyLinkedList {
    Node head;
    int length;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.length = 0;
        this.head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= this.length) {
            return -1;
        }

        Node current = head;
        int counter = 0;
        while(counter != index) {
            current = current.next;
            counter++;
        }
        return current.val;

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        if(this.length == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        this.length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == 0) {
            addAtHead(val);
            return;
        }

        if(this.length == index) {
            addAtTail(val);
            return;
        }

        if(index > this.length) {
            return;
        }

        Node newNode = new Node(val);
        Node current = head;
        int counter = 0;
        while(counter != index-1) {
            current = current.next;
            counter++;
        }
        newNode.next = current.next;
        current.next = newNode;
        this.length++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.length) {
            return;
        }

        Node curr = head;
        if(index == 0) {
            head = curr.next;
        } else {
            Node prev = null;
            Node current = head;
            int counter = 0;
            while(counter != index) {
                prev = current;
                current = current.next;
                counter++;
            }
            prev.next=current.next;
            this.length--;
        }
    }

    public void printLinkedList(MyLinkedList linkedList) {
        Node current = linkedList.head;
        while(current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtIndex(1, 7);
        myLinkedList.printLinkedList(myLinkedList);
        System.out.println(myLinkedList.get(2));
    }
}
