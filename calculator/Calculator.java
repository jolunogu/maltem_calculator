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
}
