package Stacks;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public List<Integer> binaryTreeInorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    
}
