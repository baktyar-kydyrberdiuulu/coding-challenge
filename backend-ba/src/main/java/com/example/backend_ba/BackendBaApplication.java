package com.example.backend_ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class BackendBaApplication {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(10,2,34,5,3,2);
		Algorithm algorithm = new Algorithm();

		System.out.println("Der größte Wert in der Liste ist: "+ algorithm.ermittleMaximum(numberList));
	}

}
