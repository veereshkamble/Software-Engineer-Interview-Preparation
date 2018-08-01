package HashTables;

import java.util.*;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for(int num : nums) {
            if(hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7,7};

        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        System.out.println(containsDuplicates.containsDuplicate(nums));

    }
}
