package Trees;

public class BSTInsertRecursive {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(root.val < val) {
            return insertIntoBST(root.right, val);
        } else {
            return insertIntoBST(root.left, val);
        }

    }

    public static void main(String[] args) {
        BSTInsertRecursive BSTInsertRecursive = new BSTInsertRecursive();
        TreeNode node5 = BSTInsertRecursive.insertIntoBST(null, 5);
        TreeNode node2 = BSTInsertRecursive.insertIntoBST(node5, 2);
        TreeNode node4 = BSTInsertRecursive.insertIntoBST(node5, 4);
    }
}
