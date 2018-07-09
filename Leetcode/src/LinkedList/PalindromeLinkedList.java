package LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(Node head) {
        Node reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    public Node reverseAndClone(Node node) {
        Node head = null;
        while(node != null) {
            Node newNode = new Node(node.val);
            newNode.next = head;
            head = newNode;
            node = node.next;
        }
        return head;
    }

   
}
