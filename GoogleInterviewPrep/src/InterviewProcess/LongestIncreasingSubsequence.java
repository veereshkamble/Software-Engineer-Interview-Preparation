package InterviewProcess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class LongestIncreasingSubsequence {

    //Approach #1 Brute Force : time Limit Exceeded
    /*public int lengthOfLIS(int[] nums) {
        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
    }

    public int lengthofLIS(int[] nums, int prev, int curpos) {
        if (curpos == nums.length) {
            return 0;
        }
        int taken = 0;
        if (nums[curpos] > prev) {
            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
        }
        int nottaken = lengthofLIS(nums, prev, curpos + 1);
        return Math.max(taken, nottaken);
    }*/

    //Approach 2: Dynammic Programming Time;
    /*public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }*/

    //Approach 3: Dynamic Programming with Binary Search
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

    //Aproach 4: ArrayList approach
    public int lengthOfLISList(int[] nums)
    {
        List<Integer> sequence = new ArrayList();
        for(int n : nums) update(sequence, n);

        return sequence.size();
    }

    private void update(List<Integer> seq, int n)
    {
        if(seq.isEmpty() || seq.get(seq.size() - 1) < n){
            seq.add(n);
        }
        else
        {
            seq.set(findFirstLargeEqual(seq, n), n);
        }
    }

    private int findFirstLargeEqual(List<Integer> seq, int target)
    {
        int lo = 0;
        int hi = seq.size() - 1;
        while(lo < hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(seq.get(mid) < target) lo = mid + 1;
            else hi = mid;
        }

        return lo;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int[] nums = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));
        System.out.println(longestIncreasingSubsequence.lengthOfLISList(nums));
    }
}
