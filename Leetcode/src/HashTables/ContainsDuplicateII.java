package HashTables;
import java.util.*;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])) {
                int index = hashMap.get(nums[i]);
                int diff = Math.abs(index - i);
                if(diff > k) {
                    hashMap.put(nums[i], i);
                } else if(diff <= k) {
                    return true;
                }
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        int[] nums = new int[] {1, 2, 3, 2};
        int k = 1;

        System.out.println(containsDuplicateII.containsNearbyDuplicate(nums, k));
    }
}
