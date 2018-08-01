package ArraysAndStrings;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int i=0, j=0, sum=0, min = Integer.MAX_VALUE;

        while(j < nums.length) {
            while(sum < s && j < nums.length) {
                sum += nums[j];
                j++;
            }

            if(sum >= s) {
                while(sum >= s && i < j) {
                    sum -= nums[i];
                    i++;
                }
                min = Math.min(min, j-i+1);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 3, 1, 2, 4, 3};
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(6, nums));
    }
}
