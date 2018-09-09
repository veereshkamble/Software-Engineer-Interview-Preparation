package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

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

    public static void main(String[] args) {

    }
}
