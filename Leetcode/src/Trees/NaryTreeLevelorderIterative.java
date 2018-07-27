package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelorderIterative {

    public List<List<Integer>> levelorder(NaryNode root) {
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

    public static void main(String[] args) {
        NaryNode node1 = new NaryNode();
        NaryNode node2 = new NaryNode(2, null);
        NaryNode node3 = new NaryNode();
        NaryNode node4 = new NaryNode(4, null);
        NaryNode node5 = new NaryNode(5, null);
        NaryNode node6 = new NaryNode(6, null);

        List<NaryNode> node1Children = new ArrayList<NaryNode>();
        node1Children.add(node3);
        node1Children.add(node2);
        node1Children.add(node4);

        List<NaryNode> node3Children = new ArrayList<NaryNode>();
        node3Children.add(node5);
        node3Children.add(node6);

        node1.val = 1;
        node1.children = node1Children;
        node3.val = 3;
        node3.children = node3Children;

        NaryTreeLevelorderIterative naryTreeLevelorderIterative = new NaryTreeLevelorderIterative();
        System.out.println(naryTreeLevelorderIterative.levelorder(node1));

    }
}
