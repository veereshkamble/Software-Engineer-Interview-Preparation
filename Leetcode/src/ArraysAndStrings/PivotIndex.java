package ArraysAndStrings;

public class PivotIndex {

    public int pivotIndex(int[] nums) {

        if (nums.length == 0 || nums.length == 1 || nums.length == 2) {
            return -1;
        }
        int sumRight = 0, sumLeft = 0;

        for (int i = 0; i < nums.length; i++) {
            sumRight += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            sumRight -= nums[i];
            if (sumLeft == sumRight) {
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 7, 3, 8};
        PivotIndex pivotIndex = new PivotIndex();
        System.out.println(pivotIndex.pivotIndex(nums));
    }
}
