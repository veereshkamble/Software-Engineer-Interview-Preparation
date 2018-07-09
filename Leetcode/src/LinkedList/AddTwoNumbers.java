package LinkedList;

public class AddTwoNumbers {
    public Node addTwoNumbers(  Node listOne, Node listTwo) {
        Node prev = new Node(0);
        Node head = prev;
        int carry = 0;

        while (listOne != null || listTwo != null || carry != 0) {
            Node curr = new Node(0);
            int sum = ((listTwo == null) ? 0 : listTwo.val) + ((listOne == null) ? 0 : listOne.val) + carry;
            curr.val = sum % 10;
            carry = sum / 10;
            prev.next = curr;
            prev = curr;

            listOne = (listOne == null) ? listOne : listOne.next;
            listTwo = (listTwo == null) ? listTwo : listTwo.next;
        }
        return head.next;
    }
}
