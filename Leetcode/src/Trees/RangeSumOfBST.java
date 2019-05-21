package Trees;

import java.util.Stack;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int L, int R) {

        int ans = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node != null) {
                if(node.val >= L && node.val <= R) {
                    ans += node.val;
                }

                if(node.val > L) {
                    stack.push(node.left);
                }

                if(node)
            }
        }
    }
}
