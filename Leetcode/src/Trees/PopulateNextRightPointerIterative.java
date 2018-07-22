package Trees;

public class PopulateNextRightPointerIterative {

    public void connect(TreeLinkNode root) {
        TreeLinkNode level_start = root;
        while(level_start != null) {
            TreeLinkNode cur = level_start;
            while(cur != null) {
                if (cur.left != null) {
                    cur.left.next = cur.right;
                }

                if (cur.right != null && cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            level_start = level_start.left;
        }
    }

    public static void main(String[] args) {
        TreeLinkNode node1 = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        TreeLinkNode node3 = new TreeLinkNode(3);
        TreeLinkNode node4 = new TreeLinkNode(4);
        TreeLinkNode node5 = new TreeLinkNode(5);
        TreeLinkNode node6 = new TreeLinkNode(6);
        TreeLinkNode node7 = new TreeLinkNode(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        PopulateNextRightPointerRecursive populateNextRightPointerRecursive = new PopulateNextRightPointerRecursive();
        populateNextRightPointerRecursive.connect(node1);


    }
}
