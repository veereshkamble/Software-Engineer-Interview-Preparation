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

  

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
