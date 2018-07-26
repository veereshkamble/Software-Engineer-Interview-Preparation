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
            NaryNode temp = stack.pop();
            list.add(temp.val);

            for(int i = temp.children.size() - 1; i >= 0; i--) {
                stack.add(temp.children.get(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {

        NaryNode node2 = new NaryNode(2, null);
        NaryNode node3 = new NaryNode();
        NaryNode node4 = new NaryNode(4, null);
        NaryNode node5 = new NaryNode(5, null);
        NaryNode node6 = new NaryNode(6, null);

        List<NaryNode> node1Children = new ArrayList<NaryNode>();
        node1Children.add(node2);
        node1Children.add(node3);
        node1Children.add(node4);

        List<NaryNode> node2Children = new ArrayList<NaryNode>();
        node2Children.add(node5);
        node2Children.add(node6);

        NaryNode node1 = new NaryNode(1, node1Children);
        node3.val = 3;
        node3.children = node2Children;

        System.out.println()

    }
}
