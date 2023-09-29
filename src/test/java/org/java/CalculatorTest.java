package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calc;
	
	@BeforeEach
	public void beforeEach() {
		try {
			calc = new Calculator();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test 
	@DisplayName("Test Calculator's method: add()")
	public void checkWrongAdd() {
		float result = calc.add(1, 1);
		
		assertEquals(2, result);
	}
	
	@Test 
	@DisplayName("Test Calculator's method: subtract()")
	public void checkWrongSubtract() {
		float result = calc.subtract(1, 1);
		
		assertEquals(0, result);
	}
	
	@Test 
	@DisplayName("Test Calculator's method: divide()")
	public void checkWrongDivide() throws Exception {
		float result = calc.divide(1, 3);
		
		assertEquals(1f / 3f, result);
	}
	
	@Test 
	@DisplayName("Test throw declaration Calculator's method divide() by 0")
	public void divisionByZero() {
		assertThrows(Exception.class, () -> calc.divide(1, 0), "you cannot divide a number by 0");
	}
	
	@Test 
	@DisplayName("Test Calculator's method: multiply()")
	public void checkWrongMultiply() {
		float result = calc.multiply(1, 2);
		
		assertEquals(2, result);
	}
	
}
