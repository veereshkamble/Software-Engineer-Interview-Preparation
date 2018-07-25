package Trees;

public class BSTInsert {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return root;
        }

        TreeNode cur = root;
        TreeNode prev = cur;

        while(cur != null) {
            if(val < cur.val) {
                prev = cur;
                cur = cur.left;
            } else if (val > cur.val) {
                prev = cur;
                cur = cur.right;
            }
        }

        if(val < prev.val) {
            prev.left.val = val;
        } else if(val > prev.val) {
            prev.right.val = val;
        }

        return root;
    }


}
