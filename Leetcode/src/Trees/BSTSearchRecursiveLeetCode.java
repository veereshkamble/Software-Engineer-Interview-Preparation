package Trees;

public class BSTSearchRecursiveLeetCode {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode searchBST(TreeNode root, int target) {
            if (root == null || root.val == target) {
                return root;
            }
            if (target < root.val) {
                return searchBST(root.left, target);
            }
            return searchBST(root.right, target);
        }
    }
}
