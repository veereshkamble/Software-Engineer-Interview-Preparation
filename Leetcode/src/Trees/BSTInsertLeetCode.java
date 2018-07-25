package Trees;

public class BSTInsertLeetCode {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        TreeNode cur = root;
        while(true) {
            if(cur.val <= val) {
                if(cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = new TreeNode(val);
                    break;
                }
            } else {
                if(cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = new TreeNode(val);
                    break;
                }
            }

        }
        return root;
    }

    public static void main(String[] args) {
        BSTInsertLeetCode bstInsertLeetCode = new BSTInsertLeetCode();
        TreeNode node5 = bstInsertLeetCode.insertIntoBST(null, 5);
        TreeNode node2 = bstInsertLeetCode.insertIntoBST(node5, 2);
        TreeNode node4 = bstInsertLeetCode.insertIntoBST(node5, 4);
    }
}
