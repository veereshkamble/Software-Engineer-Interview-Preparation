package Recursion;
import java.util.Arrays;

public class MergeSorting {

    public void sort(int[] array) {
        mergeSort(array, 0, array.length -1);
    }

    public void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (int) Math.floor((start+end)/2);
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }
    }

    public void merge(int[] array, int start, int middle, int end) {
        int[] left = new int[middle-start +1];
        int[] right = new int[end-middle];

        for(int i=0; i<left.length; i++) {
            left[i] = array[start+i];
        }

        for(int j=0; j<right.length; j++) {
            right[j] = array[middle+1+j];
        }

        int i=0, j=0;
/*        for(int k=start; k<=end; k++) {
            if(j >= right.length || (i<left.length && left[i] < right[j])) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }*/

        int k = start;
        while (i<left.length && j<right.length) {
            if(left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {23,7,3,2,10,9,8,11,6,14,17,19};
        MergeSorting mergesort = new MergeSorting();
        mergesort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
