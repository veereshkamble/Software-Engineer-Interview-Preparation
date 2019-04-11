/*
Given a linked list, determine if it has a cycle in it.

        To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.



        Example 1:

        Input: head = [3,2,0,-4], pos = 1
        Output: true
        Explanation: There is a cycle in the linked list, where tail connects to the second node.


        Example 2:

        Input: head = [1,2], pos = 0
        Output: true
        Explanation: There is a cycle in the linked list, where tail connects to the first node.


        Example 3:

        Input: head = [1], pos = -1
        Output: false
        Explanation: There is no cycle in the linked list.




        Follow up:

        Can you solve it using O(1) (i.e. constant) memory?
*/

package LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        if(head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;
        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node( 3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //node5.next = node1;

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println(linkedListCycle.hasCycle(node1));
    }
}
