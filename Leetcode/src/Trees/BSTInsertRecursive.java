package Trees;

public class BSTInsertRecursive {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(root.val < val) {
            return insertIntoBST(root.right, val);
        } else {
            return insertIntoBST(root.left, val);
        }

    }

    
}
