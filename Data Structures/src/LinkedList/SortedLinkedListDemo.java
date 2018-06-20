package LinkedList;

public class SortedLinkedListDemo {

    public static void main(String[] args) {

        SortedLinkedList sortedLinkedList = new SortedLinkedList();

        sortedLinkedList.insertSortedLinkedList(7);
        sortedLinkedList.insertSortedLinkedList(10);
        sortedLinkedList.insertSortedLinkedList(2);

        System.out.println(sortedLinkedList);
    }
}
