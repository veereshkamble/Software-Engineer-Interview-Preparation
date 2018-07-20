package Trees;
import java.util.*;

public class SymmetricTreeIterative {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left;
        TreeNode right;
        if(root.left != null) {
            if(root.right == null) {
                return false;
            }
            stack.push(root.left);
            stack.push(root.right);
        } else if(root.right != null) {
            return false;
        }

        while(!stack.isEmpty()) {
            if(stack.size() % 2 != 0) {
                return false;
            }
            right = stack.pop();
            left = stack.pop();

            if(left.left != null) {
                if(right.right == null) {
                    return false;
                }
                stack.push(left.left);
                stack.push(right.right);
            } else if(right.right != null) {
                return false;
            }

            if(left.right != null) {
                if(right.left == null) {
                    return false;
                }
                stack.push(left.right);
                stack.push((right.left));
            } else if(right.left != null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode(1);
        TreeNode nodeB = new TreeNode(2);
        TreeNode nodeC = new TreeNode(2);
        TreeNode nodeD = new TreeNode(3);
        TreeNode nodeE = new TreeNode(4);
        TreeNode nodeF = new TreeNode(4);
        TreeNode nodeG = new TreeNode(3);

        nodeA.left = nodeB;
        nodeA.right = nodeC;

        nodeB.left = nodeD;
        nodeB.right = nodeE;

        nodeC.left = nodeF;
        nodeC.right = nodeG;

        SymmetricTreeIterative symmetricTreeIterativey= new SymmetricTreeIterative();
        System.out.println(symmetricTreeIterativey.isSymmetric(nodeA));

    }
}
