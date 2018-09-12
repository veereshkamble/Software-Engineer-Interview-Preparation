package Trees;

public class KthLargestELementInAStreamLeetcode {


    class KthLargest {
        // insert a node into the BST
        private Node insertNode(Node root, int num) {
            if (root == null) {
                return new Node(num, 1);
            }
            if (root.val < num) {
                root.right = insertNode(root.right, num);
            } else {
                root.left = insertNode(root.left, num);
            }
            root.cnt++;
            return root;
        }

        private int searchKth(Node root, int k) {
            // m = the size of right subtree
            int m = root.right != null ? root.right.cnt : 0;
            // root is the m+1 largest node in the BST
            if (k == m + 1) {
                return root.val;
            }
            if (k <= m) {
                // find kth largest in the right subtree
                return searchKth(root.right, k);
            } else {
                // find (k-m-1)th largest in the left subtree
                return searchKth(root.left, k - m - 1);
            }
        }

       

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
