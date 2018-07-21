package Trees;
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
}
