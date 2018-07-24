package Trees;

public class InorderPredecessorInBSTRecursive {

    public TreeNode successor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val >= p.val) {
            return successor(root.left, p);
        } else {
            TreeNode right = successor(root.right, p);
            return (right != null) ? right : root;
        }
    }

}
