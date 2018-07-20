package Trees;
import java.util.*;

public class PathSumIterative {

    public boolean hasPathSum(TreeNode root,  int sum) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty() && root != null) {
            TreeNode cur = stack.pop();
            if(cur.left == null && cur.right == null) {
                if(cur.val == sum) {
                    return true;
                }
            }

            if(cur.right != null) {
                cur.right.val = cur.val + cur.right.val;
                stack.push(cur.right);
            }

            if(cur.left != null) {
                cur.left.val = cur.val + cur.left.val;
                stack.push(cur.left);
            }
        }
        return false;
    }
}
