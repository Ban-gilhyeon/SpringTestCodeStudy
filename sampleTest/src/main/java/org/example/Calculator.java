package org.example;

public class Calculator {

	public long calculate(long num1, String operator, long num2){
		long answer  = 0;
		switch (operator){
			case "+":
				answer = num1 + num2;
				return answer;
			case "-":
				answer = num1 - num2;
				return answer;
			case "/":
				answer = num1 / num2;
				return answer;
			case "*":
				answer = num1 * num2;
				return answer;
			default:
				throw new InvalidOperatorExceoption();

		}
	}

}
