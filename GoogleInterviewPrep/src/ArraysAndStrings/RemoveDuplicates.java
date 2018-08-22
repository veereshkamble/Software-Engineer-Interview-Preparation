package ArraysAndStrings;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 2) return n;
        int id = 1;
        for(int i = 1; i < n; ++i)
            if(nums[i] != nums[i-1]) nums[id++] = nums[i];
        return id;

    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[] {0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 4, 5, 5,}));
    }

}
