package Trees;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderRecursive {

    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(NaryNode root) {
        if (root == null)
            return list;


        if (root.children != null) {
            for (NaryNode node : root.children) {
                preorder(node);
            }
        }
        list.add(root.val);
        
        return list;
    }
}
