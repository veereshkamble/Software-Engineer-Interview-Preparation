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
        
    }
}
