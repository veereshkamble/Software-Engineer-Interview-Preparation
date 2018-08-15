package com.interviewprep.sortingalgorithms;

public class SelectionSort {

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static  void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxIndex = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[maxIndex]) {
                    maxIndex = i;
                }
                swap(intArray, maxIndex, lastUnsortedIndex);
            }
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
