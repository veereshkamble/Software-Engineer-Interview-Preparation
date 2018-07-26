package Trees;
import java.util.*;

public class NaryTreePreorderIterative {

    public List<Integer> preorder(NaryNode root) {

        List<Integer> list = new ArrayList<Integer>();

        if(root == null) {
            return list;
        }

        Stack<NaryNode> stack = new Stack<NaryNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);

             if(root.children != null) {
                 for(int i = root.children.size() - 1; i >= 0; i--) {
                     stack.add(root.children.get(i));
                 }
             }
        }
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

        NaryTreePreorderIterative naryTreePreorderIterative = new NaryTreePreorderIterative();
        System.out.println(naryTreePreorderIterative.preorder(node1));

    }
}
