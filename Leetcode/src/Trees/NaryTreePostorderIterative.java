package Trees;

import java.util.*;

public class NaryTreePostorderIterative {

    public List<Integer> postorder(NaryNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if(root == null) {
            return list;
        }

        Stack<NaryNode> stack = new Stack<NaryNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(0, root.val);

            if(root.children != null) {
                for(int i = 0; i < root.children.size(); i++) {
                    stack.push(root.children.get(i));
                }
            }
        }
        return list;

    }
}
