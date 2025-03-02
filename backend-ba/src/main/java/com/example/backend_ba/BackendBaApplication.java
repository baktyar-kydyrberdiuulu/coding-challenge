package com.example.backend_ba;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class BackendBaApplication {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(10,2,34,5,3,2);
		int[] bubleUnsortet = {12,3,45,44,32,-123,54,33};
		Algorithm algorithm = new Algorithm();
		algorithm.bubbleSort(bubleUnsortet);
		int[] quicksortListe = {12,4,3,11,25,89,22,123};
		System.out.println("Vor dem Sortieren: " + Arrays.toString(quicksortListe));
		algorithm.sort(quicksortListe);

		System.out.println("Nach dem Sortieren: " + Arrays.toString(quicksortListe));

//		System.out.println("Der größte Wert in der Liste ist: "algorithm.sort(quicksortListe));
	}

}
