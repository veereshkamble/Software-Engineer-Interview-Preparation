package Trees;
import java.util.*;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root != null) {
                queue.offer(root);
        }
        TreeNode cur;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subAns = new ArrayList<Integer>();
            for(int i = 0; i < size; ++i) {             //traverse nodes in the same level
                cur = queue.poll();
                subAns.add(cur.val);                    //visit the root
                if (cur.left != null) {
                    queue.offer(cur.left);              //push left child to queue if not null
                }
                if (cur.right != null) {
                    queue.offer(cur.right);             //psh right child to queue if not null
                }
            }
            ans.add(subAns);
        }
        return ans;
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

        LevelOrderTraversal levelorder = new LevelOrderTraversal();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        result = levelorder.levelOrder(node5);

        for(List list : result) {
            for (Object num : list) {
                System.out.print(num + " ");
            }
        }
    }
}
