package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		
		cal.powerOn();
		cal.powerOff();
		
		int result1 = cal.plus(5, 6);
		System.out.println(result1);
		
		double result2 = cal.divide(8, 2);
		System.out.println(result2);
		
		double result3 = cal.divide(2, 8);
		System.out.println(result3);
	}

}
