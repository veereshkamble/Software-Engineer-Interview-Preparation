package Trees;

public class DepthTopDown {

    private int answer;

    public void maximumDepth(TreeNode root, int depth) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximumDepth(root.left, depth + 1);
        maximumDepth(root.right, depth + 1);
    }

    
}
