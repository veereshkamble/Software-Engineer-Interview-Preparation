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

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        DoublyListNode prev = getTail();
        DoublyListNode curr = new DoublyListNode(val);
        prev.next = curr;
        curr.prev = prev;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        DoublyListNode prev = getNode(index - 1);
        if (prev == null) {
            return;
        }
        DoublyListNode cur = new DoublyListNode(val);
        DoublyListNode next = prev.next;
        cur.prev = prev;
        cur.next = next;
        prev.next = cur;
        if (next != null) {
            next.prev = cur;
        }
    }
}
