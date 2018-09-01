package SortingAndSearching;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int j = m - 1;
        int k = n - 1;
        while(j >= 0 && k >= 0) {
            if(nums1[j] >= nums2[k]) {
                nums1[i] = nums1[j];
                i--;
                j--;
            } else {
                nums1[i] = nums2[k];
                i--;
                k--;
            }

        }
        while(k >= 0) {
            nums1[i] = nums2[k];
            i--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums2 = new int[] {2, 5, 6, 7};
        int[] nums1 = new int[] {1, 4, 5, 5, 0, 0, 0, 0};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 4, nums2, 4);

        for(int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "  ");
        }
    }
}
