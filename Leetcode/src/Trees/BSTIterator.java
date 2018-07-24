package Trees;
import java.util.*;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    private Stack<TreeNode> stack;


    //Inititalize your data structure here
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur != null) {
            stack.push(cur);
            if(cur.left != null) {
                cur = cur.left;
            } else {
                break;
            }
        }
    }

    //@return whether we have a next smallest number or not
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    //@return the next smallest number
    public int next() {
        TreeNode node = stack.pop();
        TreeNode cur = node;

        //travere the right branch
        if(cur.right != null) {
            cur = cur.right;
            while(cur != null) {
                stack.push(cur);
                if(cur.left != null) {
                    cur = cur.left;
                } else {
                    break;
                }
            }
        }
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
