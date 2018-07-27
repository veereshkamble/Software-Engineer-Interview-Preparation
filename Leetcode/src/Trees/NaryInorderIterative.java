package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryInorderIterative {

    public List<List<Integer>> levelOrder(NaryNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<NaryNode> queue = new LinkedList<>();

        if(root != null) {
            queue.offer(root);
        }
        NaryNode cur;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subAns = new ArrayList<Integer>();
            for(int i = 0; i < size; ++i) {             //traverse nodes in the same level
                cur = queue.poll();
                subAns.add(cur.val);                    //visit the root
                if(cur.children != null){
                    for(NaryNode node : cur.children) {
                        queue.offer(node);
                    }
                }
            }
            ans.add(subAns);
        }
        return ans;
    }
}
