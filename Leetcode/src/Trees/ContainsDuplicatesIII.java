package Trees;
import java.util.*;

public class ContainsDuplicatesIII {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length <= 0 || k <= 0) {
            return false;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            /*
             * Returns the greatest element in this set less than or equal to
             * the given element, or null if there is no such element. Specified
             * by: floor(...) in NavigableSet Parameters: e the value to match
             * Returns: the greatest element less than or equal to e, or null if
             * there is no such element
             */
            if (set.floor(val) != null && (set.floor(val) + t) >= val)
                return true;
            /*
             * Returns the least element in this set greater than or equal to
             * the given element, or null if there is no such element. Specified
             * by: ceiling(...) in NavigableSet Parameters: e the value to match
             * Returns: the least element greater than or equal to e, or null if
             * there is no such element
             */
            if (set.ceiling(val) != null && (set.ceiling(val) - t) <= val)
                return true;
            set.add(val);
            if (i >= k)
                set.remove(nums[i - k]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 1};
        int k = 3;
        int t = 0;

        ContainsDuplicatesIII containsDuplicatesIII = new ContainsDuplicatesIII();
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
    }
}
