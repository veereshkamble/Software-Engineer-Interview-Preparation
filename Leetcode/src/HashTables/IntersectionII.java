package HashTables;
import java.util.*;

public class IntersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] result = new int[nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            if(hashMap.containsKey(nums1[i])) {
                int count = hashMap.get(nums1[i]);
                hashMap.put(nums1[i], count++);
            } else {
                hashMap.put(nums1[i], 1);
            }
        }

        for(int i = 0; i < nums2.length; i++) {
            if(hashMap.containsKey(nums2[i])) {
                int count = hashMap.get(nums2[i]);
                if(count != 0) {
                    result[i] = nums2[i];
                }
                hashMap.put(nums2[i], count);
            }
        }
        return result;

    }
}
