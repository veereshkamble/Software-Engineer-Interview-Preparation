package ArraysAndStrings;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int index1 = 0, index2 = numbers.length - 1;
        int[] index = new int[2];
        if(numbers == null || numbers.length < 2) return index;

        while(index1 < index2) {
            if(numbers[index1] + numbers[index2] == target) {
                index[0] = index1 + 1;
                index[1] = index2 + 1;
                break;
            } else if(numbers[index1] + numbers[index2] > target) {
                index2--;
            } else if(numbers[index1] + numbers[index2] < target) {
                index1++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] numbers = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] index = new int[2];
        index = twoSumII.twoSum(numbers, target);
        System.out.println(index[0] + ", " + index[1]);
        System.out.println(twoSumII.twoSum(numbers, target)[0] + ", " + twoSumII.twoSum(numbers, target)[1]);
    }
}
