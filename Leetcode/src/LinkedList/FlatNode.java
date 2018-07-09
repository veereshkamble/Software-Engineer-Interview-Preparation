package LinkedList;

import java.awt.*;

public class FlatNode {
    int val;
    FlatNode next;
    FlatNode prev;
    FlatNode child;

    public FlatNode(int val, FlatNode next, FlatNode prev, FlatNode child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }
}
