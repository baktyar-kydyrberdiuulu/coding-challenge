package com.example.backend_ba;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] unsorted) {

        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length - i - 1; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int trip = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = trip;
                }
            }
        }
        System.out.println("Bublesort sortet:" + Arrays.toString(unsorted));
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(numbers);
    }
}
