package Trees;

public class NaryTreeMaxDepthBottomUp {

    public int maxDepth(NaryNode root) {
        if (root == null) {
            return 0;
        }

        int max = 0;
        for (NaryNode child : root.children) { //replace left&right to for loop
            int value = maxDepth(child);

            if (value > max) {
                max = value;
            }
        }
        return max +1;
    }
}
