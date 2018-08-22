package ArraysAndStrings;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
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
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1}));
    }
}
