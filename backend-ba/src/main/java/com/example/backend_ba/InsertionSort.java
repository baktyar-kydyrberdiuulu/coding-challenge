package com.example.backend_ba;

import java.util.Arrays;

public class InsertionSort {
    // Insertion Sort
    public static void insertionSort(int[] unsorted){
        for(int i=1; i<unsorted.length; i++){
            int temp = 0;
            for (int j=i; j>0; j--){
                if(unsorted[j] < unsorted[j-1]){
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j -1];
                    unsorted[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 4, 25, 12, 22, 11, 90};



        System.out.println("Vor dem Sortieren: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("Nach dem Sortieren: " + Arrays.toString(numbers));
    }
}
