import { Component } from '@angular/core';

@Component({
  selector: 'app-pseudocode',
  imports: [],
  templateUrl: './pseudocode.component.html',
  standalone: true,
  styleUrl: './pseudocode.component.scss'
})
export class PseudocodeComponent {




//     Pseudocode (Vertiefung)
//   Hier kommen wie abgesprochen die Aufgaben zur Vorbereitung
//
// ----
// TODO - 1.03.2025
//   Sie benötigen eine Methode zur Ermittlung des größten Wertes in einer Liste mit ganzen Zahlen.
//   Die folgende Methodensignatur ist bereits vorgegeben.
//   Bitte vervollständigen Sie die Implementierung der Methode in Pseudocode.
//
//   Hinweis: Die Klasse List bietet folgende Methoden an, um auf ihre Elemente zuzugreifen.
//
//   * Integer get(int index): Gibt das Element an Index-Position index zurück. Der Index ist 0-basiert.
//   * boolean isEmpty(): Gibt true zurück, wenn die Liste kein Element enthält, sonst false.
//
//   Integer ermittleMaximum(List<Integer> liste) { ... }
   ermittleMaximum(liste:any) {
     if (liste.length == null) return null;
     if(liste.isEmpty()) return null;

     let buggest = liste.get(0);
     for (let i = 0; i < liste.length; i++) {
       if()
     }
   }


//
// ----
// TODO - 02.03.2025
//   Sie benötigen eine Methode zur Sortierung einer Liste mit ganzen Zahlen.
//   Die folgende Methodensignatur ist bereits vorgegeben.
//   Bitte vervollständigen Sie die Implementierung der Methode in Pseudocode.
//
//   Hinweis: Die Klasse List bietet folgende Methoden an, um auf ihre Elemente zuzugreifen.
//
// * Integer size(): Gibt die Anzahl der Elemente in der Liste zurück.
// * Integer get(int index): Gibt das Element an Index-Position index zurück. Der Index ist 0-basiert.
// * void set(int index, Integer element): Setzt das Element an Index-Position index auf den übergebenen Wert element. Der Index ist 0-basiert.
//
//   List<Integer> sortiere(List<Integer> liste) { ... }
  //TODO Bubble sort lernen
  sortiere(liste:any) {
     for(let i = 0; i < liste.size() - 1; i++){
       for (let j = i + 1; j < liste.size() - 1; j++){
         let current = liste.get(i);
         let next = liste.get(j);
         let temp = current

         if(next < current){
           liste.set
         }
       }
     }
  }
//
// ----
//TODO - 03.03.2025
//   Die Filialen Ihres Unternehmens liefern regelmäßig ihre Umsatzzahlen für den vergangenen
// Betrachtungszeitraum. Die Daten liegen in einem 0-basierten, zweidimensionalen Array vor,
//   das wie folgt aufgebaut ist.
//
//   [
//   [1234, 100],
//     [2345, 99],
//     [3456, 101]
//   ]
//
// Jeder Eintrag des Arrays enthält die Nummer der meldenden Filiale (im obigen Beispiel 1234, 2345
// und 3456) sowie den erwirtschafteten Umsatz (im Beispiel 100, 99 und 101). Im Beispiel hat Filiale
// 2345 somit einen Umsatz von 99 EUR erwirtschaftet. Die Nummer dieser Filiale steht in
// umsaetze[1][0] und ihr Umsatz in umsaetze[1][1].
//
//   Ihre Chefin möchte nun wissen, welche Filiale den größten Umsatz erwirtschaftet hat.
//   Bitte vervollständigen Sie dafür die Implementierung der folgenden Methode in Pseudocode.
//
//   Hinweise:
// * Die Methode soll nicht den größten Umsatz zurückliefern, sondern die Nummer der Filiale
// mit dem größten Umsatz, im Beispiel also 3456 (weil 101 der größte Umsatz im Array ist).
// * Die Länge des Arrays können Sie mit umsaetze.length bestimmen.
//
//   Integer ermittleStandortMitGroesstemUmsatz(Integer[][] umsaetze) { ... }
//
// ----
//TODO - 04.03.2025
//   Die Filialen Ihres Unternehmens liefern am Ende jedes Jahres ihre Umsatzzahlen für die vergangenen
// 12 Monate. Die Daten liegen in einem 0-basierten, zweidimensionalen Array vor,
//   das wie folgt aufgebaut ist.
//
//   [
//   [1234, 12, 43, 54, 12, 11, 5, 52, 12, 44, 23, 54, 89],
//     [2345, 1, 14, 44, 12, 11, 4, 12, 22, 41, 22, 34, 121],
//     [3456, 12, 43, 67, 12, 10, 5, 2, 22, 44, 23, 42, 100]
//   ]
//
// Jeder Eintrag des Arrays enthält die Nummer der meldenden Filiale (im obigen Beispiel 1234, 2345
// und 3456) sowie den erwirtschafteten Umsatz für jeden der 12 Monate (im Beispiel 12, 43, 54 usw.)
// Die Nummer der ersten Filiale steht somit in umsaetze[0][0] und ihre Umsätze in umsaetze[0][1]
// bis umsaetze[0][12].
//
//   Ihre Chefin möchte nun für jede Filiale wissen, wie groß ihr gesamter Jahresumsatz und ihr
// durchschnittlicher Monatsumsatz ist.
//   Bitte vervollständigen Sie dafür die Implementierung der folgenden Methode in Pseudocode.
//
//   Hinweise:
// * Die Länge des Arrays können Sie mit umsaetze.length bestimmen.
// * Die Methode soll für jede Filiale ein Element im Array erzeugen, das die Nummer der Filiale,
//   ihren Jahresumsatz und den durchschnittlichen Monatsumsatz enthält.
// * Beim durchschnittlichen Umsatz sollen die Nachkommastellen ignoriert werden.
// * Beispielergebnis für das obige Array:
//   [
//     [1234, 411, 34],
//     [2345, 338, 28],
//     [3456, 382, 31]
//   ]
//
// public Integer[][] ermittleDurchschnittlichenUmsatzJeStandort(Integer[][] umsaetze) { ... }
}
