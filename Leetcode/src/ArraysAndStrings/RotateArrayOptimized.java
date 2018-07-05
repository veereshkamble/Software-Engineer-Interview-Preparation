package ArraysAndStrings;

public class RotateArrayOptimized {
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0 , nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArrayOptimized rotateArrayOptimized = new RotateArrayOptimized();
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k =3;

        int[] newNums = rotateArrayOptimized.rotate(nums, k);
        for(int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }
    }
}
