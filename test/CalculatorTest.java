package test;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;


import calculator.Calculator;
import calculator.Operation;

/*
 * 
 */
public class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	@Test
	void operationTest() {		
		Operation additionOperation = (x, y) -> {
			return x + y;};
		Operation substractionOperation = (x, y) -> {
				return x - y;};
		Operation divisionOperation = (x, y) -> {
				return x/y;};
		Operation multiplicationOperation = (x, y) -> {
				return x*y;};	
		// EXECUTE
		Double add = calculator.execute(2, 3, additionOperation);
		Double sub = calculator.execute(2, 3, substractionOperation);
		Double div = 0.0;
		try {
			div = calculator.execute(10, 5, divisionOperation);
		} catch (ArithmeticException e) {
			
		}
		Double mult = calculator.execute(2, 3, multiplicationOperation);
		
		// CHECK
		assert(add == 5);
		assert(sub == -1);
		assert(div == 2);
		assert(mult == 6);
	}
}
