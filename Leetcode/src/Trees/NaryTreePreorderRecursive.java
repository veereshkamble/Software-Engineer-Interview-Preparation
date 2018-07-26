package Trees;
import java.util.*;

public class NaryTreePreorderRecursive {

    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(NaryNode root) {
        if (root == null)
            return list;

        list.add(root.val);
        for(NaryNode node: root.children)
            preorder(node);

        return list;
    }
}
