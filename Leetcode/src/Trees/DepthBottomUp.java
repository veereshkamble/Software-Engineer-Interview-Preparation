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

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node5.left = node2;
        node5.right = node6;

        node2.left = node1;
        node2.right = node4;

        node1.left = null;
        node1.right = null;

        node4.left = node3;
        node4.right = null;

        node6.left = null;
        node6.right = node7;

        node7.left = null;
        node7.right = null;

        DepthBottomUp depthBottomUp = new DepthBottomUp();
        System.out.println(depthBottomUp.maximumDepth(node5));
    }
}
