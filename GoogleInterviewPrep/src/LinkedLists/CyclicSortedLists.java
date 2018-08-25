package LinkedLists;

public class CyclicSortedLists {

    public ListNode insert(ListNode head, int insertVal) {
        //If head is null, return a new ListNode
        if(head == null) {
            ListNode ListNode = new ListNode(insertVal);
            ListNode.next = ListNode;
            return ListNode;
        }

        ListNode pre = head;
        ListNode next = head.next;

        while(next != null) {
            if(pre.val <= insertVal && next.val >= insertVal //pre.val >= insertVal >= next.val
                    || next.val >= insertVal && pre.val >= next.val
                    // There is no ListNode.val smaller than the insertVal && pre is the tail
                    || pre.val <= insertVal && pre.val >= next.val
                // There is no ListNode.val greater than the insertVal && pre is the tail
                    ) {
                ListNode ListNode = new ListNode(insertVal);
                pre.next = ListNode;
                ListNode.next = next;
                break;
            }
            pre = next;
            next = next.next;
        }

        return head;
    }
}
