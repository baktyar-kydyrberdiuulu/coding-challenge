package com.example.backend_ba;

import java.util.Arrays;

public class Quicksort {

    public static void quicksort(int[] elements, int left, int right) {
        //
        if (left >= right) return;
        //Pivot-Element platzieren und Index züruckgeben.
        int pivotPos = partition(elements, left, right);

        //Rekursiv linke und rechte Teile sortieren
        quicksort(elements, left, pivotPos - 1);
        quicksort(elements, pivotPos + 1, right);

    }

    // Partitionieren des Arrays und Rückgabe des Pivots-Index
    public static int partition(int[] elements, int left, int right) {
        int pivot = elements[right]; // Pivot ist das letzte Element

        int i = (left - 1); //Index des kleineren Elements
        for (int j = left; j < right; j++) {
            //Wenn aktuelles Element kleiner oder gleich Pivot ist
            if (elements[j] <= pivot) {
                i++;
                //Element tauschen
                int temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
            }
        }
        // Pivot an die richtige Stelle setzen
        int temp = elements[i + 1];
        elements[i + 1] = elements[right];
        elements[right] = temp;

        return i + 1; // Pivot Index zurückgeben.


    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};



        System.out.println("Vor dem Sortieren: " + Arrays.toString(numbers));
        quicksort(numbers, 0, numbers.length - 1);
		System.out.println("Nach dem Sortieren: " + Arrays.toString(numbers));
    }
}
