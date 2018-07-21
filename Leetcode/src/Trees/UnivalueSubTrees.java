package Trees;

public class UnivalueSubTrees {
    int count;

    public int countUnivalSubtrees(TreeNode root) {
        count = 0;
        helper(root);
        return count;
    }

    private boolean helper(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean left = helper(root.left);
        boolean right = helper(root.right);
        if(left && right) {
            if(root.left != null && root.val != root.left.val) {
                return false;
            }

            if(root.right != null && root.val != root.right.val) {
                return false;
            }
            count++;
            return true;
        }
        return false;
    }
}
