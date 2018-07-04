package ArraysAndStrings;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        int len = removeElement.removeElement(nums, val);
        for(int i=0; i<len; i++) {
            System.out.println(nums[i]);
        }
    }
}
