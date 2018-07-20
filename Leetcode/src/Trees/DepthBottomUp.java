package Trees;

public class DepthBottomUp {

    public int maximumDepth(TreeNode root) {
        if (root == null) {
            return 0;                                   // return 0 for null node
        }
        int left_depth = maximumDepth(root.left);
        int right_depth = maximumDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;	// return depth of the subtree rooted at root
    }

   
}
