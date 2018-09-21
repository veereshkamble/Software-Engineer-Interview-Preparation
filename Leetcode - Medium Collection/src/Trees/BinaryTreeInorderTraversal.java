package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root != null) {
            result.addAll(inorderTraversalRecursive(root.left));
            result.add(root.val);
            result.addAll(inorderTraversalRecursive(root.right));
        }
        return result;
    }
}
