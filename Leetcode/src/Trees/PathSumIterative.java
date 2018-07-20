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

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node13 = new TreeNode(13);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node5.left = node4;
        node5.right = node8;

        node4.left = node11;

        node11.left = node7;
        node11.right = node2;

        node8.left = node13;
        node8.right = node9;

        node9.right = node1;

        PathSumIterative pathSumIterative = new PathSumIterative();
        System.out.println(pathSumIterative.hasPathSum(node5, 22));


    }
}
