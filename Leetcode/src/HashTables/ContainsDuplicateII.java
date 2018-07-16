package HashTables;
import java.util.*;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])) {
                int index = hashMap.get(nums[i]);
                int diff = Math.abs(index - i);
                if(diff <= k) return true;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }
}
