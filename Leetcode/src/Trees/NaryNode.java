package Trees;
import java.util.*;

public class NaryNode {

    public int val;
    public List<NaryNode> children;

    public NaryNode() {
    }

    public NaryNode(int val, List<NaryNode> children) {
        this.val = val;
        this.children = children;
    }
}
