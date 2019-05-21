package Trees;

import java.util.Stack;

public class RangeSumOfBST {

    int ans = 0;

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

                if(node.val < R) {
                    stack.push(node.right);
                }
            }
        }
        return ans;
    }

    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R)
                ans += node.val;
            if (L < node.val)
                dfs(node.left, L, R);
            if (node.val < R)
                dfs(node.right, L, R);
        }
    }




}
