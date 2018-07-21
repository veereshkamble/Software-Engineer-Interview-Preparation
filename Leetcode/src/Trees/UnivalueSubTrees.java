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

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode(5);
        TreeNode nodeB = new TreeNode(1);
        TreeNode nodeC = new TreeNode(5);
        TreeNode nodeD = new TreeNode(5);
        TreeNode nodeE = new TreeNode(5);
        TreeNode nodeF = new TreeNode(5);
        TreeNode nodeG = new TreeNode(7);

        nodeA.left = nodeB;
        nodeA.right = nodeC;

        nodeB.left = nodeD;
        nodeB.right = nodeE;

        nodeC.left = nodeF;
        nodeC.right = nodeG;

        UnivalueSubTrees univalueSubTrees = new UnivalueSubTrees();
        System.out.println(univalueSubTrees.countUnivalSubtrees(nodeA));



    }
}
