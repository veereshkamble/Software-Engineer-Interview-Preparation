package ArraysAndStrings;

import java.util.Arrays;

public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i+=2) {
            sum = sum+nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartitionI partitionI = new ArrayPartitionI();
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(partitionI.arrayPairSum(nums));
    }
}
