package HashTables;
import java.util.*;

public class IntersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<>();

        if(nums1.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < nums1.length; i++) {
            if(hashMap.containsKey(nums1[i])) {
                int count = hashMap.get(nums1[i]);
                count++;
                hashMap.put(nums1[i], count);
            } else {
                hashMap.put(nums1[i], 1);
            }
        }

        for(int i = 0; i < nums2.length; i++) {
            if(hashMap.containsKey(nums2[i])) {
                int count = hashMap.get(nums2[i]);
                if(count != 0) {
                    result.add(nums2[i]);
                    count--;
                }

                hashMap.put(nums2[i], count);
            }
        }

        int index = 0;
        int[] res = new int[result.size()];

        for(int num : result) {
            res[index++] = num;
        }
        return res;

    }

    public static void main(String[] args) {
        IntersectionII intersectionII = new IntersectionII();
        int[] nums1 = new int[] {1};
        int[] nums2 = new int[] {1, 1};
        int[] result = new int[10];

        result = intersectionII.intersect(nums1, nums2);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
