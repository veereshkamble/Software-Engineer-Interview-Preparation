package Sorting;

import java.util.Arrays;

public class QuickSorting {

    public void sort (int[] array) {
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot+1, end);
        }
    }

    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        for(int j = start; j <= end-1; j++){
            if(array[j] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i = i+1;
            }
        }
        array[end] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] array = new int[] {23,7,3,2,10,9,8,11,6,14,17,19};
        QuickSorting quickSort = new QuickSorting();
        quickSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
