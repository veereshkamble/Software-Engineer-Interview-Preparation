package Trees;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderRecursive {

    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(NaryNode root) {
        if (root == null)
            return list;


        if (root.children != null) {
            for (NaryNode node : root.children) {
                preorder(node);
            }
        }
        list.add(root.val);

        return list;
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

        NaryTreePostorderRecursive naryTreePostorderRecursive = new NaryTreePostorderRecursive();
        System.out.println(naryTreePostorderRecursive.preorder(node1));

    }
}
