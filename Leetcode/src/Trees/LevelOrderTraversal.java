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
}
