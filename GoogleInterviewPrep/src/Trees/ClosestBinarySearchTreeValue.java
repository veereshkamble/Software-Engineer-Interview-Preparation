package Trees;

public class ClosestBinarySearchTreeValue {

    public int closestValue(TreeNode root, double target) {
        double closest = Integer.MAX_VALUE;
        int value = 0;
        TreeNode current = root;
        while (current != null) {
            if (closest > Math.abs(current.val-target)) {
                closest = Math.abs(current.val-target);
                value = current.val;
            }

            if (current.val < target) {
                current = current.right;
            } else if (current.val > target) {
                current = current.left;
            } else {
                break;
            }
        }
        return value;
    }
}
