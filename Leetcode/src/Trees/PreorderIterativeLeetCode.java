package Trees;
import java.util.*;

public class PreorderIterativeLeetCode {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if (root != null) {
            s.push(root);
        }
        TreeNode cur;
        while (!s.empty()) {
            cur = s.pop();
            answer.add(cur.val);            // visit the root
            if (cur.right != null) {
                s.push(cur.right);          // push right child to stack if it is not null
            }
            if (cur.left != null) {
                s.push(cur.left);           // push left child to stack if it is not null
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node5.left = node2;
        node5.right = node6;

        node2.left = node1;
        node2.right = node4;

        node1.left = null;
        node1.right = null;

        node4.left = node3;
        node4.right = null;

        node6.left = null;
        node6.right = node7;

        node7.left = null;
        node7.right = null;

        PreorderIterativeLeetCode preorder = new PreorderIterativeLeetCode();
        List<Integer> result = new ArrayList<Integer>();

        result = preorder.preorderTraversal(node5);

        for(int node : result) {
            System.out.print(node + " ");
        }
    }
}
