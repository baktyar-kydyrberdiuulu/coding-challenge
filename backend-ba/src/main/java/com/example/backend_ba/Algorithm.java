package com.example.backend_ba;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class Algorithm {
    //   Sie benötigen eine Methode zur Ermittlung des größten Wertes in einer Liste mit ganzen Zahlen.
//   Die folgende Methodensignatur ist bereits vorgegeben.
//   Bitte vervollständigen Sie die Implementierung der Methode in Pseudocode.
//
//   Hinweis: Die Klasse List bietet folgende Methoden an, um auf ihre Elemente zuzugreifen.
//
//   * Integer get(int index): Gibt das Element an Index-Position index zurück. Der Index ist 0-basiert.
//   * boolean isEmpty(): Gibt true zurück, wenn die Liste kein Element enthält, sonst false.
//
    public Integer ermittleMaximum(List<Integer> liste) {
        if (liste.isEmpty()) return null;
        int maxPosition = liste.get(0);

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) > maxPosition) {
                maxPosition = liste.get(i);
            }
        }
        return maxPosition;
    }

    // Bubble Sorting|Learn by doing
    void bubbleSort(int[] unsorted) {

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

    // Quicksort Simple
    void sort(int[] elements) {
        quicksort(elements, 0, elements.length - 1);

    }

    private void quicksort(int[] elements, int left, int right) {
        //
        if (left >= right) return;
        //Pivot-Element platzieren und Index züruckgeben.
        int pivotPos = partition(elements, left, right);

        //Rekursiv linke und rechte Teile sortieren
        quicksort(elements, left, pivotPos - 1);
        quicksort(elements, pivotPos + 1, right);

    }

    // Partitionieren des Arrays und Rückgabe des Pivots-Index
    public int partition(int[] elements, int left, int right) {
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
    // Insertion Sort
    void InsertionSort(int[] unsorted){
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
    // Zweidimensionale Arrays
//    int [][] x = new int[zeile][spalte]
    void zweidimensionaleArrays(int [][] multi){
        for (int i=0; i<multi.length; i++){
            for (int j=0; j< multi[i].length; j++){
                multi[i][j] = (i + 1) * (j+1);
                System.out.print(multi[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
