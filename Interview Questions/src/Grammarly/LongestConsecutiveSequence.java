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

    
}
