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

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 2, 1, 3, 5 ,7, 7, 9, 10};
        int[] nums2 = new int[] {2, 2, 3, 6, 7};

        Intersection intersection = new Intersection();
        int[] result = intersection.instersection(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
