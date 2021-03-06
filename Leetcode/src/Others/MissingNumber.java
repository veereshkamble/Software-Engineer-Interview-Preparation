package Others;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumberBitManipulation(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }

    public int missingNumberSum(int[] nums) { //sum
        int len = nums.length;
        int sum = (0+len)*(len+1)/2;
        for(int i=0; i<len; i++)
            sum-=nums[i];
        return sum;
    }

    public int missingNumberBinarySearch(int[] nums) { //binary search
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid= (left + right)/2;
        while(left<right){
            mid = (left + right)/2;
            if(nums[mid]>mid) right = mid;
            else left = mid+1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 4, 2, 1, 3, 0, 6, 5};
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumberBitManipulation(nums));
        System.out.println(missingNumber.missingNumberSum(nums));
        System.out.println(missingNumber.missingNumberBinarySearch(nums));

    }
}
