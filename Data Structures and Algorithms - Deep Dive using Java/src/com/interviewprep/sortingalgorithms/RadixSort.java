package com.interviewprep.sortingalgorithms;

public class RadixSort {

    public static void radixSort(int[] input, int radix, int width) {
        for(int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;

        int[] countArray = new int[radix];

        for(int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }
    }

    public static void main(String[] args) {
        int[] radixSort = {4725, 4586, 1330, 8792, 1594, 5729 };

        for(int i = 0; i < radixSort.length; i++) {
            System.out.print(radixSort[i] + " ");
        }
    }
}
