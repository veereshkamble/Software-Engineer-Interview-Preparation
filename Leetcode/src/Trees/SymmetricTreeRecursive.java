package Trees;

public class SymmetricTreeRecursive {

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }
        if(left.val != right.val) {
            return false;
        }
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode(1);
        TreeNode nodeB = new TreeNode(2);
        TreeNode nodeC = new TreeNode(2);
        TreeNode nodeD = new TreeNode(3);
        TreeNode nodeE = new TreeNode(4);
        TreeNode nodeF = new TreeNode(4);
        TreeNode nodeG = new TreeNode(3);

        nodeA.left = nodeB;
        nodeA.right = nodeC;

        nodeB.left = nodeD;
        nodeB.right = nodeE;

        nodeC.left = nodeF;
        nodeC.right = nodeG;

        SymmetricTreeRecursive symmetricTreeRecursive = new SymmetricTreeRecursive();
        System.out.println(symmetricTreeRecursive.isSymmetric(nodeA));

    }
}
