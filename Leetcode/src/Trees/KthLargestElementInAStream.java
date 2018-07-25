package Trees;

public class KthLargestElementInAStream {
    private TreeNodeK root;
    private int k;
    private boolean isInitialized;
    public KthLargestElementInAStream (int k, int[] nums) {
        this.k = k;
        for(int num : nums) {
            add(num);
        }
        isInitialized = true;
    }

    public int add(int val) {
        if(root == null) {
            root = new TreeNodeK(val);
        } else {
            TreeNodeK cur = root;

            while(cur != null) {
                cur.count++;


            }
        }
    }
}
