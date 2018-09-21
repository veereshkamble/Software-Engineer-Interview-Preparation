package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {// Travel to each node's left child, till reach the left leaf
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop(); // Backtrack to higher level node A
            res.add(cur.val);  // Add the node to the result list
            cur = cur.right;   // Switch to A'right branch
        }
        return res;
    }
}
