package Trees;

public class InorderSuccessorBST {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode ret = null;

        while(root != null) {
            if(root.val <= p.val) {
                root = root.right;
            } else {
                ret = root;
                root = root.left;
            }
        }
        return ret;
    }
}
