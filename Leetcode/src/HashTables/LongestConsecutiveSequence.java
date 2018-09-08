package HashTables;

public class LongestConsecutiveSequence {

    private static boolean arrayContains(int[] nums, int num) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == num) {
                return true;
            }
        }
        return  false;
    }

    public static int longestSequenceBruteForce(int[] nums) {
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
}
