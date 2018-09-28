package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsI {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }   
}
