package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println(result1); 
		
		int result2 = Calculator.plus(10, 5);
		System.out.println(result2);
		int result3 = Calculator.minus(10, 5);
		System.out.println(result3);
	}

}
