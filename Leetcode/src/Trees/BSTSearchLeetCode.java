package Trees;

public class BSTSearchLeetCode {

    public TreeNode searchBST(TreeNode root, int target) {
        TreeNode cur = root;
        while (cur != null && cur.val != target) {
            if (target < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur;
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

        BSTSearchLeetCode bstSearch = new BSTSearchLeetCode();
        System.out.println(bstSearch.searchBST(node5, 7).val);
    }
}
