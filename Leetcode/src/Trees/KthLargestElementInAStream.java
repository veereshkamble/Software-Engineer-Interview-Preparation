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

                if(val < cur.val) {
                    if(cur.left != null) {
                        cur = cur.left;
                    } else {
                        cur.left = new TreeNodeK(val);
                        break;
                    }
                } else {
                    if(cur.right != null) {
                        cur = cur.right;
                    } else {
                        cur.right = new TreeNodeK(val);
                        break;
                    }
                }
            }
        }

        if(!isInitialized) {
            return -1;
        }

        TreeNodeK root = findKthLargest();
        return root.val;
    }

    private TreeNodeK findKthLargest() {
        int counter = k;
        TreeNodeK cur = root;

        while(cur != null && counter > 0) {
            int pos = (cur.right == null ? 1 : cur.right.count + 1);

            if(counter == pos) {
                break;
            } else if(counter > pos) {
                counter -= pos;
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4, 5, 8, 2};
        int k = 3;

        KthLargestElementInAStream kthLargestElementInAStream = new KthLargestElementInAStream(k, nums);

        System.out.println(kthLargestElementInAStream.add(3));
        System.out.println(kthLargestElementInAStream.add(5));
        System.out.println(kthLargestElementInAStream.add(10));
        System.out.println(kthLargestElementInAStream.add(9));
        System.out.println(kthLargestElementInAStream.add(4));
        System.out.println(kthLargestElementInAStream.add(17));

    }
}
