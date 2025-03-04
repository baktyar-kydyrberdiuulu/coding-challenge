package com.example.backend_ba;

import java.util.Arrays;

public class ZweidimensionalesArray {

    // Zweidimensionale Arrays
//    int [][] x = new int[zeile][spalte]
    static  void zweidimensionaleArrays(int [][] multi){
        for (int i=0; i<multi.length; i++){
            for (int j=0; j< multi[i].length; j++){
                multi[i][j] = (i + 1) * (j+1);
                System.out.print(multi[i][j] + "\t");
            }
            System.out.println();
        }



    }

    // Übungsaufgabe für zweidimensionale arrays
//    Laut Aufgabenstellung soll die Funktion true zurückgeben, wenn ein Termin gefunden werden kann, und false, wenn nicht. Außerdem:
//
//    Wenn kein bestimmter Slot gewählt wurde (slot == -1), soll geprüft werden, ob irgendein freier Slot existiert.
//    Wenn ein bestimmter Slot angegeben wurde (slot >= 0), soll geprüft werden, ob genau dieser frei ist.

    //     boolean getAppoinment(int month, int day, int id, int slot){
//        for (int[] row: getTimeTable(id)){
//            if(row[0] == month && row[1] == day){
//                if(slot == -1){
//                    for (int i=2; i< row.length; i++){
//                        if(row[i] == 0) return true; // Freier Slot gefunden
//                    }
//                    return false; // Kein freier Slot gefunden.
//                }
//                else {
//                    return row[slot + 2] == 0; // Prüft direkt den gewünschten Slot
//                }
//            }
//        }
//        return false; // Datum nicht gefunden
//
//    }
   static boolean getAppoinment(int month, int day, int id, int slot){
        boolean treffer = false;
        int[][] timeTableDoc = getTimeTable(id);
        for (int i = 0; i<timeTableDoc.length; i++){
            if(month == timeTableDoc[i][0] && day == timeTableDoc[i][1]){
                if (slot<0){
                    for (int j=0; j<8; j++){
                        if (timeTableDoc[i][2 +j] == 0){
                            treffer=true;
                        }
                    }
                } else {
                    if(timeTableDoc[i][2+slot] == 0){
                        treffer=true;
                    }
                }
            }
        }
        return treffer;

    }

    private static int[][] getTimeTable(int id) {
        return new int[][]{
                {9, 30, 1, 1, 0, 0, 1, 1, 1, 1},
                {10, 1, 0, 0, 1, 1, 0, 0, 1, 1},
                {10, 2, 0, 0, 0, 1, 1, 1, 1, 1}
        };
    }

    public static void main(String[] args) {
        int [][] multi = new int[5][10];



        System.out.println("Vor dem Sortieren: " + Arrays.toString(multi));
        zweidimensionaleArrays(multi);
        System.out.println("Nach dem Sortieren: " + Arrays.toString(multi));

        System.out.println(getAppoinment(9,30,1, -1));
        System.out.println(getAppoinment(9,30,1, 2));
        System.out.println(getAppoinment(9,30,1, 0));
    }
}
