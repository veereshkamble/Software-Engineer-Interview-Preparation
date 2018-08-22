package ArraysAndStrings;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0) nums[index++]=nums[i];
        }
        while(index<nums.length){
            nums[index++]=0;
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[] {0,7,12,0,0,10,8,0,11});
    }
}
