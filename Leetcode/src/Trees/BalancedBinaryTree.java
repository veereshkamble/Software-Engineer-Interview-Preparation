package Trees;

public class BalancedBinaryTree {

    private int helper(TreeNode root, int height)
    {
        if (root == null)
        {
            return height;
        }

        int leftTree = helper(root.left, height + 1);
        int rightTree = helper(root.right, height + 1);
        if (leftTree < 0 || rightTree < 0 || Math.abs(leftTree - rightTree) > 1)
        {
            return -1;
        }

        return Math.max(leftTree, rightTree);
    }

    public boolean isBalanced(TreeNode root) {
        return helper(root, 0) >= 0;
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

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        System.out.println(balancedBinaryTree.isBalanced(node5));
    }
}
