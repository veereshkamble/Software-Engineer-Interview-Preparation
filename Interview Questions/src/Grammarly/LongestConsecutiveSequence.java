package Grammarly;

public class LongestConsecutiveSequence {

    private boolean arrayContains(int[] nums, int num) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == num) {
                return true;
            }
        }
        return  false;
    }

    public int longestSequenceBruteForce(int[] nums) {
        int longestStreak = 0;

        for(int num : nums) {
            int currentNum = num;
            int currentStreak = 1;

            while(arrayContains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        
    }


}
