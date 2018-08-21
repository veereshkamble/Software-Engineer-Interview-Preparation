package InterviewProcess;

public class LongestUnivaluePath {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
    }

    int len = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root != null)
            longestUnivaluePath(root, -1);
        return len;
    }
    private int longestUnivaluePath(TreeNode curr, int val){
        if(curr == null) return 0;
        int l = longestUnivaluePath(curr.left, curr.val);
        int r = longestUnivaluePath(curr.right, curr.val);
        int count = 0;
        len = Math.max(len, l+r); //l is "valid" connecting edges to me from left
        if(curr.val == val)
            count = 1+Math.max(l,r); //give it to caller max path with same number, include me
        return count;
    }

    public static  void main(String[] args) {
        TreeNode nodeA =  new TreeNode(1);
        TreeNode nodeB =  new TreeNode(4);
        TreeNode nodeC =  new TreeNode(5);
        TreeNode nodeD =  new TreeNode(4);
        TreeNode nodeE =  new TreeNode(4);
        TreeNode nodeF =  new TreeNode(5);

        nodeA.left = nodeB;
        nodeA.right = nodeC;

        nodeB.left = nodeD;
        nodeB.right = nodeE;

        nodeC.right = nodeF;

        LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();
        System.out.println(longestUnivaluePath.longestUnivaluePath(nodeA));

    }

}
