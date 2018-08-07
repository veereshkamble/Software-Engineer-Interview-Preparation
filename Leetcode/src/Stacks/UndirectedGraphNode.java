package Stacks;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraphNode {

    int label;
    List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int value) {
        label = value;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
