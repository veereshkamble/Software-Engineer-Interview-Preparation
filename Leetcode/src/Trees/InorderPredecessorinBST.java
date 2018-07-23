package Trees;

public class InorderPredecessorinBST {

    public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        TreeNode ret = null;

        while(root != null) {
            if(root.val >= p.val) {
                root = root.left;
            } else {
                ret = root;
                root = root.right;
            }
        }
        return ret;
    }
}
