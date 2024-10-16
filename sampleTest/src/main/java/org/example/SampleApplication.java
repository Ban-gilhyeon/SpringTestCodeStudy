package org.example;

import java.util.Scanner;

public class SampleApplication {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		CalculationRequest request = new CalculationRequestReader().read();
		long answer = calculator.calculate(request.getNum1(), request.getOperator(), request.getNum2());
		System.out.println(answer);

	}
}
