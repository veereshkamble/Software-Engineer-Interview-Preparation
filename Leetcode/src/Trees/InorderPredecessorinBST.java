package Trees;

public class InorderPredecessorinBST {

    public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        TreeNode ret = null;

        while(root != null) {
            if(root.val >= p.val) {
                root = root.left;
            } else {
                ret = root;
                root = root.right;
            }
        }
        return ret;
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

        InorderPredecessorinBST inorderPredecessorinBST = new InorderPredecessorinBST();
        System.out.println(inorderPredecessorinBST.inorderPredecessor(node5, node2).val);
    }
}
