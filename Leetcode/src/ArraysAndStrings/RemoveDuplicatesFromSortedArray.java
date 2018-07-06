package ArraysAndStrings;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        if(nums == null) return 0;

        int id = 1;
        for(int i = 1; i < len; i++) {
            if(nums[i] != nums[i-1]) {
                nums[id] = nums[i];
                id++;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[] {0,0,0,1,1,1,2,3,3,4,4,5,5,5,5,6,6,7};
        int len = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        for(int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
