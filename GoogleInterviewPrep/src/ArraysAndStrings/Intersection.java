package ArraysAndStrings;
import java.util.*;

public class Intersection {

    public int[] instersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        //Add all elements from array 1 to the hash set
        for(int i = 0; i< nums1.length; i++) {
            hashSet.add(nums1[i]);
        }

        //if the number is present in the hashset then add the number ot the result array and remove it from the hashset
        for(int j = 0; j < nums2.length; j++) {
            if(hashSet.contains(nums2[j])) {
                result.add(nums2[j]);
                hashSet.remove(nums2[j]);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    

}
