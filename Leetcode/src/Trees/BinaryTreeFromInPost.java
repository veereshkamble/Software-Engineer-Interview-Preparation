package Trees;
import jdk.nashorn.api.tree.BinaryTree;

import java.util.*;

public class BinaryTreeFromInPost {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }

        return buildTreeInPost(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, hashMap);
    }

    public TreeNode buildTreeInPost(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd, HashMap<Integer, Integer> hashMap) {
        if(pStart > pEnd || iStart > iEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[pEnd]);
        int index = hashMap.get(postorder[pEnd]);

        TreeNode leftChild = buildTreeInPost(inorder, iStart, index - 1, postorder, pStart, pStart + index - iStart - 1, hashMap);
        TreeNode rightChild  = buildTreeInPost(inorder, index + 1, iEnd, postorder, pStart + index - iStart, pEnd - 1, hashMap);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node3.left = node4;
        node3.right = node5;

        int[] inorder = new int[] {9, 3, 15, 20, 7};
        int[] postorder = new int[] {9, 15, 7, 20, 3};

        BinaryTreeFromInPost binaryTreeFromInPost = new BinaryTreeFromInPost();
        System.out.println(binaryTreeFromInPost.buildTree(inorder, postorder));
    }
}
