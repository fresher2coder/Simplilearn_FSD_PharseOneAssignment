package assignments;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Sum: " + calc.addition(10, 25));
		System.out.println("Difference: " + calc.subtraction(10, 25));
		System.out.println("Product: " + calc.multiplication(10, 25));
		System.out.println("Quotient: " + calc.division(10, 25));
		System.out.println("Reminder: " + calc.reminder(10, 25));
		System.out.println("Incremented: " + calc.increment(10));
		System.out.println("Decremented: " + calc.decrement(10));
		
	}

}

class Calculator{
	
	Calculator(){
		System.out.println("ARITHMETIC CALCULATOR");
	}
	
	double addition(double a, double b) {
		return a+b;
	}
	
	double subtraction(double a, double b) {
		return a-b;
	}
	
	double multiplication(double a, double b) {
		return a*b;
	}
	
	double division(double a, double b) {
		return a/b;
	}
	
	double reminder(double a, double b) {
		return a%b;
	}
	
	double increment(int a) {
		return a++;
	}
	
	double decrement(int a) {
		return --a;
	}
	
	
}
