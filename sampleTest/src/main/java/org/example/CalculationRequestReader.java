package org.example;

import java.util.Scanner;

public class CalculationRequestReader {

	public CalculationRequest read(){
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 시작 : ex) 1 + 2");
		String result = sc.nextLine();
		CalculationRequest request = new CalculationRequest(result.split(" "));
		return request;
	}
}
