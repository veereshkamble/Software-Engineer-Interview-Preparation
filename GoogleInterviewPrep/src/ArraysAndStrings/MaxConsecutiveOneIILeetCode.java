package ArraysAndStrings;

public class MaxConsecutiveOneIILeetCode {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zero = 0, k = 1; // flip at most k zero
        int low = 0;

        for (int high = 0; high < nums.length; high++) {
            if (nums[high] == 0)
                zero++;
            while (zero > k) {
                if (nums[low++] == 0) {
                    zero--;
                }
            }
            max = Math.max(max, high - low + 1);
        }
        return max;
    }

    public static void main(String[] args) {
       MaxConsecutiveOneIILeetCode maxConsecutiveOneIILeetCode = new MaxConsecutiveOneIILeetCode();
        System.out.println(maxConsecutiveOneIILeetCode.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1}));
    }
}
