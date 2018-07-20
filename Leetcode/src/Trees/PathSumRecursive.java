package Trees;

public class PathSumRecursive {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }

        if(root.left == null && root.right == null) {
            return (root.val == sum);
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum-root.val);
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node13 = new TreeNode(13);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node5.left = node4;
        node5.right = node8;

        node4.left = node11;

        node11.left = node7;
        node11.right = node2;

        node8.left = node13;
        node8.right = node9;

        node9.right = node1;

        PathSumRecursive pathSumRecursive = new PathSumRecursive();
        System.out.println(pathSumRecursive.hasPathSum(node5, 22));


    }
}
