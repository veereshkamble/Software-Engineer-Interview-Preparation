package LinkedList;

public class InsertIntoACyclicSortedList {

    public Node insert(Node head, int insertValue) {
        if(head == null) {
            Node node = new Node(insertValue);
            node.next = node;
            return node;
        }

        Node pre = head;
        Node next = head.next;

        while(next != null) {
            if(pre.val <= insertValue && next.val >= insertValue || next.val >=insertValue && pre.val >= next.val || pre.val <= insertValue && pre.val >= next.val) {
                Node node = new Node(insertValue);
                pre.next = node;
                node.next = next;
                break;
            }
            pre = next;
            next = next.next;
        }
        return head;
    }
}
