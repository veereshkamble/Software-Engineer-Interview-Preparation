package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversalQueue {

    public List<List<Integer>> zigZagTraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leftToRight = true;

        if(root == null) {
            return result;
        }

        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(leftToRight) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }

                if(node.left != null) {
                    queue.add(node.left);
                }

                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(list);
            leftToRight = !leftToRight;
        }
        return result;
    }
}
