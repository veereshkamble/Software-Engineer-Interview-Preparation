package SortingAndSearching;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        int j = m - 1;
        int k = n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[j] >= nums2[k]) {
                nums1[i] = nums1[j];
                j--;
            } else {
                nums1[i] = nums2[k];
                k--;
            }
            i--;
        }
    }
}
