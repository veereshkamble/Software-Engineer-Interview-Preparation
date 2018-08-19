package SAP;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthNaryTree {

    public class Node {
        int val;
        List<Node> children = new ArrayList<Node>();
    }

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }

        int max = 0;
        for(Node child : root.children) {
            int value = maxDepth(child);

            if(value > max) {
                max = value;
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        MaximumDepthNaryTree maximumDepthNaryTree = new MaximumDepthNaryTree();
        
    }
}
