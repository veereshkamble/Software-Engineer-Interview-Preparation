package Trees;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderRecursive {

    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(NaryNode root) {
        if (root == null)
            return list;

        list.add(root.val);
        if (root.children != null) {
            for (NaryNode node : root.children) {
                preorder(node);
            }
        }
        return list;
    }
}
