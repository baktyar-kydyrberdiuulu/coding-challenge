package com.example.backend_ba;

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
        if(liste.isEmpty()) return null;
        int maxPosition = liste.get(0);

        for (int i = 0; i < liste.size(); i++){
            if (liste.get(i)> maxPosition){
                maxPosition= liste.get(i);
            }
        }
        return maxPosition;
    }
}
