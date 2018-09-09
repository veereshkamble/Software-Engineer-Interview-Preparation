package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumZero {

    public List<List<Integer>> threeSumThreeLoops(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);

                        if(!result.contains(list)) {
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSumSortingGeeksForGeeks(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;  // skip same result
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;  // skip same result
                    }
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ThreeSumZero threeSum  = new ThreeSumZero();
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSumThreeLoops(nums);

        for(List list : result) {
            for(Object num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        List<List<Integer>> result1 = threeSum.threeSumThreeLoops(nums);

        for(List list : result1) {
            for(Object num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
