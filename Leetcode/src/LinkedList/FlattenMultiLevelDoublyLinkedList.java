package LinkedList;

public class FlattenMultiLevelDoublyLinkedList {

    public FlatNode flatten(FlatNode head) {
        FlatNode cur = head;
        while(cur != null) {
            if(cur.child != null) {
                join(cur.child, cur, cur.next);
                cur.child = null;
            }
            cur = cur.next;
        }
        return head;
    }

    public void join(FlatNode node, FlatNode before, FlatNode after) {
        before.next = node;
        node.prev = before;
        FlatNode lastNode = node;

        while (node != null) {
            if(node.child != null) {
                join(node.child, node, node.next);
                node.child = null;
            }
            lastNode = node;
            node = node.next;
        }
        lastNode.next = after;
        if(after != null) {
            after.prev = lastNode;
        }
    }
}
