package org.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void 덧셈_연산을_할_수_있다(){
		//given
		long num1 = 2;
		long num2 = 3;
		String operator = "+";
		Calculator calculator = new Calculator();

		//when
		long result = calculator.calculate(num1,operator,num2);

		//then
		assertEquals(5,result); //junit의 assertion
		//assertThat(result).isEqualTo(5); // assertj의 assertion
	}

	@Test
	public void 뺄셈_연산을_할_수_있다(){
		//given
		long num1 = 3;
		long num2 = 2;
		String operator = "-";
		Calculator calculator = new Calculator();

		//when
		long result = calculator.calculate(num1,operator,num2);

		//then
		assertEquals(1,result); //junit의 assertion
		//assertThat(result).isEqualTo(5); // assertj의 assertion
	}


	@Test
	public void 곱셈_연산을_할_수_있다(){
		//given
		long num1 = 2;
		long num2 = 3;
		String operator = "*";
		Calculator calculator = new Calculator();

		//when
		long result = calculator.calculate(num1,operator,num2);

		//then
		assertEquals(6,result); //junit의 assertion
		//assertThat(result).isEqualTo(5); // assertj의 assertion
	}


	@Test
	public void 나눗셈_연산을_할_수_있다(){
		//given
		long num1 = 6;
		long num2 = 3;
		String operator = "/";
		Calculator calculator = new Calculator();

		//when
		long result = calculator.calculate(num1,operator,num2);

		//then
		assertEquals(2,result); //junit의 assertion
		//assertThat(result).isEqualTo(5); // assertj의 assertion
	}

	@Test
	public void 잘못된_연산자가_요청으로_들어올_경우_에러(){
		//given
		long num1 = 2;
		long num2 = 3;
		String operator = "x";
		Calculator calculator = new Calculator();

		//when


		//then
		assertThrows(InvalidOperatorExceoption.class,()->
				calculator.calculate(num1,operator,num2));
		//assertThat(result).isEqualTo(5); // assertj의 assertion
	}
}
