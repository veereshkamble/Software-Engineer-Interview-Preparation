package Trees;

public class BSTDeleteRecursive {

    private TreeNode findSuccessor(TreeNode root) {
        TreeNode cur = root.right;
        while (cur != null && cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        // return null if root is null
        if (root == null) {
            return root;
        }

        // delete current node if root is the target node
        if (root.val == key) {
            // replace root with root->right if root->left is null
            if (root.left == null) {
                return root.right;
            }

            // replace root with root->left if root->right is null
            if (root.right == null) {
                return root.left;
            }

            // replace root with its successor if root has two children
            TreeNode p = findSuccessor(root);
            root.val = p.val;
            root.right = deleteNode(root.right, p.val);
            return root;
        }
        if (root.val < key) {
            // find target in right subtree if root->val < key
            root.right = deleteNode(root.right, key);
        } else {
            // find target in left subtree if root->val > key
            root.left = deleteNode(root.left, key);
        }
        return root;
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

        BSTDeleteRecursive bstDeleteRecursive = new BSTDeleteRecursive();
        System.out.println(bstDeleteRecursive.deleteNode(node5, 2));
    }
}
