package calculator;

/*
 * Calculator
 */
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation additionOperation = (x, y) -> {
			return x + y;};
		Operation substractionOperation = (x, y) -> {
				return x - y;};
		Operation divisionOperation = (x, y) -> {
				return x/y;};
		Operation multiplicationOperation = (x, y) -> {
				return x*y;};	

		Calculator calculator = new Calculator();
		System.out.println("Addition 2 + 3 = " + calculator.execute(2, 3, additionOperation));
		System.out.println("Substraction 2 - 3 = " + calculator.execute(2, 3, substractionOperation));
		System.out.println("Addition 2 / 3 = " + calculator.execute(2, 3, divisionOperation));
		System.out.println("Addition 2 * 3 = " + calculator.execute(2, 3, multiplicationOperation));
	}
	
	/*
	 * 
	 */
	public double execute(double x, double y, Operation op) {
		return op.calculate(x, y);		
	}
	
	
	
	
	/********************************************************/
	/* THIS PART BELOW IS ADDED AFTER TEST AT MALTEM OFFICE */
	/********************************************************/
	
	/**
	 * Execute an addition operation
	 * @param x first operand
	 * @param y second operand
	 * 
	 * @return the result of addition operation
	 */
	public double addition(double x, double y) {
		Operation additionOperation = (num1, num2) -> {
			return num1 + num2;};
		return execute(x, y, additionOperation);
	}
	/**
	 * Execute a subtraction operation
	 * @param x first operand
	 * @param y second operand
	 * 
	 * @return the result of subtraction operation
	 */
	public double subtraction(double x, double y) {
		Operation subtractionOperation = (num1, num2) -> {
			return num1 - num2;};
		return execute(x, y, subtractionOperation);
	}
	/**
	 * Execute a division operation
	 * @param x first operand
	 * @param y second operand
	 * 
	 * @return the result of division operation
	 */
	public double division(double x, double y) throws ArithmeticException {
		Operation divisionOperation = (num1, num2) -> {
			return num1/num2;};
		double result = execute(x, y, divisionOperation);
		if (Double.isInfinite(result)) {
			throw new ArithmeticException("overflow");
		}

		return result;
	}
	/**
	 * Execute a multiplication operation
	 * @param x first operand
	 * @param y second operand
	 * 
	 * @return the result of multiplication operation
	 */
	public double multiplication(double x, double y) {
		Operation multiplicationOperation = (num1, num2) -> {
			return num1*num2;};
		return execute(x, y, multiplicationOperation);
	}
}
