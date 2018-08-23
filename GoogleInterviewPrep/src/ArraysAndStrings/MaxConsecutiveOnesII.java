package ArraysAndStrings;

public class MaxConsecutiveOnesII {

    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }

        int i = 0, j = 0, count = 0, result = 0;
        boolean foundZero = false;

        while(i < nums.length) {
            if(nums[i] == 0) {
                if(foundZero) {
                    count = 0;
                    i = j;
                }
                foundZero = true;
                count = count + 1;
                result = Math.max(result, count);
                i++;
                j = i;
            } else {
                count = count + 1;
                result = Math.max(result, count);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesII maxConsecutiveOnesII = new MaxConsecutiveOnesII();
        System.out.println(maxConsecutiveOnesII.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1}));
    }
}
