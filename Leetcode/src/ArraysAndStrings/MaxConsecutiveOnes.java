package ArraysAndStrings;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, result = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0)
                count = 0;
            else {
                count++;
                result = Math.max(count, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1};
        System.out.println(MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}
