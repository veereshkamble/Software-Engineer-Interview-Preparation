package LinkedList;

public class DoublyLinkedList {
    DoublyListNode head;

    public DoublyLinkedList() {
        head = null;
    }

    private DoublyListNode getNode(int index) {
        DoublyListNode cur = head;
        for (int i = 0; i < index && cur != null; ++i) {
            cur = cur.next;
        }
        return cur;
    }


    private DoublyListNode getTail() {
        DoublyListNode curr = head;
        while(curr != null && curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    public int get(int index) {
        DoublyListNode curr = getNode(index);
        return curr == null ? -1 : curr.val;
    }

    public void addAtHead(int val) {
        DoublyListNode curr = new DoublyListNode(val);
        curr.next = head;
        if(head != null) {
            head.prev = curr;
        }
        head = curr;
        return;
    }
}
