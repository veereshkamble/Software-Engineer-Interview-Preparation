package InterviewProcess;

public class LongestUnivaluePath {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    int len = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root != null)
            longestUnivaluePath(root, -1);
        return len;
    }
    private int longestUnivaluePath(TreeNode curr, int val){
        if(curr == null) return 0;
        int l = longestUnivaluePath(curr.left, curr.val), r = longestUnivaluePath(curr.right, curr.val), count = 0;
        len = Math.max(len, l+r); //l is "valid" connecting edges to me from left
        if(curr.val == val)
            count = 1+Math.max(l,r); //give it to caller max path with same number, include me
        return count;
    }

}
