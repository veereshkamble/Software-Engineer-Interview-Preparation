package ArraysAndStrings;

import javafx.scene.PointLight;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] nums) {
        int length = nums.length;

        for(int i=length-1; i>=0; i--) {
            if(nums[i]<9) {
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int[] newNumber = new int[length+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9,9,9,9,8};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(nums)));
    }
}
