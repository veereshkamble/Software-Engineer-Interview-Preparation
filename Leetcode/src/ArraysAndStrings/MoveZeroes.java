package ArraysAndStrings;

public class MoveZeroes {
    public  int[] moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < nums.length) {
            nums[index] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[] {0,1,0,3,12};
        int[] newNums = moveZeroes.moveZeroes(nums);

        for(int i = 0; i <  newNums.length; i++) {
            System.out.println(newNums[i] + " ");
        }
    }
}
