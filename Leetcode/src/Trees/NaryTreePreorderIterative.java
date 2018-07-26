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
}
