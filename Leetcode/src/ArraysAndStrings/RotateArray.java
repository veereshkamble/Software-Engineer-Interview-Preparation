package ArraysAndStrings;

import javafx.scene.transform.Rotate;

public class RotateArray {
    public int[] rotate(int[] nums, int k) {

        int[] newNums = new int[nums.length];
        if(nums == null || nums.length == 0) return newNums;

        if(k > nums.length) return newNums;

        int diff = nums.length - k;

        for (int i = 0; i < nums.length; i++) {
            if (i >= nums.length-k) {
                newNums[i-diff] = nums[i];
            } else {
                newNums[i+k] = nums[i];
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 8;

        int[] newNums = rotateArray.rotate(nums, k);
        for(int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }
    }
}
