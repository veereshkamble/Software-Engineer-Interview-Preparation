package Stacks;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraphNode {

    int label;
    List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int value) {
        this.label = value;
        this.neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
