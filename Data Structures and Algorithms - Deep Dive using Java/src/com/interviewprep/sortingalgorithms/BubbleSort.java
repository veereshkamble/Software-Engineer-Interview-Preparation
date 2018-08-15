package com.interviewprep.sortingalgorithms;

public class BubbleSort {

    public static void swap(int[] array, int i, int j) {

        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

    }
}
