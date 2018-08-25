package LinkedLists;

public class IntersectionOfLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = length(headA);
        int lengthB = length(headB);

        while(lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }

        while(lengthA < lengthB) {
            headB = headB.next;
            lengthB--;
        }

        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int length(ListNode node) {
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}
