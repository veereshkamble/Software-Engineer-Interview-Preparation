package ArraysAndStrings;

public class DominantIndex {
    public int dominantIndex(int[] nums) {
        if(nums.length == 0) return -1;

        if(nums.length == 1) return 0;

        int secondLargest = 0;
        int largest = 0;
        int index = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] != largest && nums[i] >= secondLargest) {
                secondLargest = nums[i];
            }
        }

        if(largest >= 2*secondLargest) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 1, 0, 4, 5, 11};
        DominantIndex dominantIndex = new DominantIndex();
        System.out.println(dominantIndex.dominantIndex(nums));
    }
}
