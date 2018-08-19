package SAP;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 7, 9, 0, 10, 11};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

        for(int  i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
