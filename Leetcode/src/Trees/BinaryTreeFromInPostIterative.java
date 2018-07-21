package Trees;
import java.util.*;

public class BinaryTreeFromInPostIterative {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        int ip = inorder.length - 1;
        int pp = inorder.length - 1;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = new TreeNode(postorder[pp]);
        TreeNode prev = null;
        stack.push(root);
        pp--;

        while(pp >= 0) {
            while(!stack.isEmpty() && stack.peek().val == inorder[ip]) {
                prev = stack.pop();
                ip--;
            }

            TreeNode newNode = new TreeNode(postorder[pp]);
            if(prev != null) {
                prev.left = newNode;
            } else if(!stack.isEmpty()) {
                TreeNode currTop = stack.peek();
                currTop.right = newNode;
            }
            stack.push(newNode);
            prev = null;
            pp--;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = new int[] {9, 3, 15, 20, 7};
        int[] postorder = new int[] {9, 15, 7, 20, 3};

        BinaryTreeFromInPostIterative binaryTreeFromInPostIterative = new BinaryTreeFromInPostIterative();
        System.out.println(binaryTreeFromInPostIterative.buildTree(inorder, postorder));
    }
}
