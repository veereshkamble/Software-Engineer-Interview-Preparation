package LinkedList;

public class MergeTwoSortedLists {
    public Node mergeTwoLists(Node listOne, Node listTwo) {

        Node preHead = new Node(-1);
        Node prev = preHead;

        while(listOne != null && listTwo != null) {
            if(listOne.val <= listTwo.val) {
                prev.next = listOne;
                listOne = listOne.next;
            } else {
                prev.next = listTwo;
                listTwo = listTwo. next;
            }
        }
        prev.next = listOne == null ? listTwo : listOne;

        return preHead;
    }
}
