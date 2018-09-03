package Design;
import java.util.Random;

public class ShuffleAnArray {




        private int[] nums;
        private Random random;

        public ShuffleAnArray(int[] nums) {
            this.nums = nums;
            random = new Random();
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            if(nums == null) return null;
            int[] a = nums.clone();
            for(int j = 1; j < a.length; j++) {
                int i = random.nextInt(j + 1);
                swap(a, i, j);
            }
            return a;
        }

        private void swap(int[] a, int i, int j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int[] param_1 = obj.reset();
     * int[] param_2 = obj.shuffle();
     */


        public static void main(String[] args) {
            int[] nums = new int[] {1,2,3,4,5};
            ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
            int[] result = shuffleAnArray.shuffle();
            for(int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

            int[] result1 = shuffleAnArray.shuffle();
            for(int i = 0; i < result1.length; i++) {
                System.out.print(result1[i] + " ");
            }
            System.out.println();

            int[] result2 = shuffleAnArray.reset();
            for(int i = 0; i < result2.length; i++) {
                System.out.print(result2[i] + " ");
            }
            System.out.println();


        }
}
