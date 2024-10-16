package org.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

public class CalculationReqeustReaderTest {

	@Test
	public void System_in으로_데이터를_읽어드릴_수_있다(){
		//given
		CalculationRequestReader reader = new CalculationRequestReader();

		//when
		System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
		CalculationRequest request = reader.read();

		//then
		assertEquals(2, request.getNum1());
		assertEquals("+", request.getOperator());
		assertEquals(3, request.getNum2());

	}

}
