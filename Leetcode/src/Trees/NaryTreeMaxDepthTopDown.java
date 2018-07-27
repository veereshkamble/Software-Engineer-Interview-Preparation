package Trees;

public class NaryTreeMaxDepthTopDown {

    public int maxDepth(NaryNode root) {
        if (root == null) return 0;

        int max = 1;

        for (NaryNode child : root.children) {
            max = Math.max(max, maxDepth(child) + 1);
        }

        return max;

    }
}
