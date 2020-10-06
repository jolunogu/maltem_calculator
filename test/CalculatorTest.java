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
	
	
	
	
	/********************************************************/
	/* THIS PART BELOW IS ADDED AFTER TEST AT MALTEM OFFICE */
	/********************************************************/
	@Test
	void additionNominalTest() {
		Double result = calculator.addition(2, 3);
		assert(result == 5);
	}
	@Test
	void subtractionNominalTest() {
		Double result = calculator.subtraction(2, 3);
		assert(result == -1);
	}
	@Test
	void divisionNominalTest() {
		Double result = calculator.division(10, 2);
		assert(result == 5);
	}
	@Test
	void multiplicationNominalTest() {
		Double result = calculator.multiplication(2, 3);
		assert(result == 6);
	}
	@Test
	void divisionByZeroTest() {
		Exception expectedException = null;
		try {
			Double result = calculator.division(10, 0);
		} catch (ArithmeticException e) {
			expectedException = e;
		}
		assert(expectedException != null);
		assert(expectedException instanceof ArithmeticException);
	}
	
	@Test
	void operationsUsingCalculatorOperatorsTest() {
		Double resultAdd = calculator.execute(2, 3,calculator.additionOp);
		Double resultSub = calculator.execute(2, 3,calculator.subtractionOp);
		Double resultDiv = calculator.execute(10, 2, calculator.divisionOp);
		Double resultMult = calculator.execute(2, 3, calculator.multiplicationOp);
		
		Exception expectedException = null;
		try {
			Double resultDivByZero = calculator.execute(10, 0, calculator.divisionOp);
		} catch (ArithmeticException e) {
			expectedException = e;
		}
		
		assert(resultAdd == 5);
		assert(resultSub == -1);
		assert(resultDiv == 5);
		assert(resultMult == 6);
		
		assert(expectedException != null);
		assert(expectedException instanceof ArithmeticException);
	}
}
